package com.gleo.plugins.hexiagon.portlet.announcements.listener;

import com.gleo.plugins.hexiagon.constants.AnnouncementConstants;
import com.gleo.plugins.hexiagon.constants.PortletKeys;
import com.gleo.plugins.hexiagon.model.Announcement;
import com.gleo.plugins.hexiagon.service.AnnouncementLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutConstants;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

import java.util.LinkedHashMap;
import java.util.List;

import javax.portlet.PortletPreferences;

import org.joda.time.DateTime;

/**
 * @author guillaumelenoir
 *
 */
public class DeleteAnnouncementsListener implements MessageListener {

	/**
	 * The logger.
	 */
	private static final Log LOGGER = LogFactoryUtil.getLog(DeleteAnnouncementsListener.class);
	
	/**
	 * Default delta
	 */
	private static int DELTA = 1000;
	
	/**
	 * Default value
	 */
	private final static int DEFAULT_PERIOD_TO_DELETE_IN_DAYS = 60;
	
	/**
	 * Delete all announcements by expiration date
	 * Fire every day at midnight
	 * 0 0 0 * * ?
	 * Change it from liferay-portlet.properties
	 * 
	 * @param message
	 * @throws MessageListenerException
	 */
	@Override
	public void receive(Message message) throws MessageListenerException {
		LOGGER.info("BEGIN : delete all announcements by expiration date");
		
		try {
			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>(2);
			params.put("site", StringPool.TRUE);
			params.put("active", StringPool.TRUE);
			
			List<Company> companies = CompanyLocalServiceUtil.getCompanies();
			
			for (Company company : companies) {
				List<Group> groups = GroupLocalServiceUtil.search(company.getCompanyId(), StringPool.BLANK, params, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
				for (Group group : groups) {
					long announcementDisplayPlid = PortalUtil.getPlidFromPortletId(group.getGroupId(), PortletKeys.ADD_ANNOUNCEMENT_PORTLETID);
					
					if (announcementDisplayPlid != LayoutConstants.DEFAULT_PLID) {
						Layout announcementDisplayLayout = LayoutLocalServiceUtil.getLayout(announcementDisplayPlid);
						PortletPreferences announcementDisplayRelatedAssetsPreferences = PortletPreferencesFactoryUtil.getLayoutPortletSetup(announcementDisplayLayout, PortletKeys.ADD_ANNOUNCEMENT_PORTLETID);
						int days = GetterUtil.getInteger(announcementDisplayRelatedAssetsPreferences.getValue(AnnouncementConstants.DEFAULT_PERIOD_TO_DELETE_IN_DAYS, String.valueOf(DEFAULT_PERIOD_TO_DELETE_IN_DAYS)));	
						
						LOGGER.info("Days = " + days);
						
						if(days > DEFAULT_PERIOD_TO_DELETE_IN_DAYS) {
							deleteAnnouncementsJob(days);
						}
					}
				}
			}
		} catch (Exception e) {
			LOGGER.error(e);
		}

		
		LOGGER.info("END : delete all announcements by expiration date");
	}

	/**
	 * Delete Announcements
	 * 
	 * @param days
	 * @throws SystemException
	 */
	private void deleteAnnouncementsJob(int days) throws SystemException {
		DateTime dateMinus = DateTime.now();
		dateMinus.minusDays(days);

		DynamicQuery dynamicQuery = AnnouncementLocalServiceUtil.dynamicQuery();
		
		dynamicQuery.add(PropertyFactoryUtil.forName(Field.STATUS).eq(WorkflowConstants.STATUS_ANY));
		dynamicQuery.add(PropertyFactoryUtil.forName(Field.CREATE_DATE).lt(dateMinus.toDate()));
		
		long count = AnnouncementLocalServiceUtil.dynamicQueryCount(dynamicQuery);
		
		LOGGER.info("Get" + count +" announcements to delete");
		
		if(count > 0) {
			
			int start = 0;
			int end = 0;
			int page = 1;
			// Not the best way !
			double limit = Math.floor(count / DELTA) + (count% DELTA ==0?0:1);
			
			while (page <= limit) {
				start = end;
				end = page * DELTA;
				
				if(end > count) {
					end = GetterUtil.getInteger(count);
				}
				page ++;
				
			}
			
			@SuppressWarnings("unchecked")
			List<Announcement> announcements = (List<Announcement>) AnnouncementLocalServiceUtil.dynamicQuery(dynamicQuery, start, end);
			
			// Delete Announcement
			AnnouncementLocalServiceUtil.deleteAnnouncements(announcements);
		}
	}

}

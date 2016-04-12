package com.gleo.plugins.hexiagon.portlet.countries.web;

import com.gleo.plugins.hexiagon.util.CountryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author guillaumelenoir
 * Portlet implementation class DisplayCountryController
 */
public class DisplayCountryController extends MVCPortlet {
 
	/**
	 * DisplayCountryController Logger.
	 */
	protected static Log LOGGER = LogFactoryUtil.getLog(DisplayCountryController.class);

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long countryId = ParamUtil.getLong(renderRequest, "countryId");

		// Set Country
		countryId = CountryUtil.getCountryIdByLocal(countryId, themeDisplay);
		
		renderRequest.setAttribute("countryId", countryId);
		renderRequest.setAttribute("regionId", ParamUtil.getLong(renderRequest, "regionId"));
		
		super.doView(renderRequest, renderResponse);
	}
}

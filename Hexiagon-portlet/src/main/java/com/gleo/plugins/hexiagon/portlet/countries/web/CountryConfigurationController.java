package com.gleo.plugins.hexiagon.portlet.countries.web;

import com.gleo.plugins.hexiagon.service.ExtCountryServiceUtil;
import com.liferay.portal.NoSuchCountryException;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.Country;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.CountryServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class CountryConfigurationController
 */
public class CountryConfigurationController extends MVCPortlet {

	/**
	 * DisplayCountryController Logger.
	 */
	protected static Log LOGGER = LogFactoryUtil.getLog(CountryConfigurationController.class);
	
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		
		PortletURL iteratorURL = renderResponse.createRenderURL();
		
		int delta = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_DELTA_PARAM, SearchContainer.DEFAULT_DELTA);
		int cur = ParamUtil.getInteger(renderRequest, "curCountry", SearchContainer.DEFAULT_CUR);

		// create search container
		SearchContainer<Country> searchCountryContainer = new SearchContainer<Country>(renderRequest, null, null, "curCountry", cur, delta, iteratorURL, null, "country-empty-results-message");

		int start = searchCountryContainer.getStart();
		int end = searchCountryContainer.getEnd();
		
		try {
			List<Country> countries = ExtCountryServiceUtil.getCountries(start, end);
			int total = ExtCountryServiceUtil.getCountriesCount();
			searchCountryContainer.setTotal(total);
			searchCountryContainer.setResults(countries);
		}
		catch (SystemException e) {
			LOGGER.error(e);
		} catch (PrincipalException pe) {
			LOGGER.error(pe);
		}
		
		renderRequest.setAttribute("searchCountryContainer", searchCountryContainer);
		
		super.doView(renderRequest, renderResponse);
	}

	/**
	 * Activate Country
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void activateCountry(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		long countryId = ParamUtil.getLong(actionRequest, "countryId");
		boolean isActive = ParamUtil.getBoolean(actionRequest, "isActive");
		
		try {
			Country country = ExtCountryServiceUtil.setActive(countryId, !isActive);
			SessionMessages.add(actionRequest, "country-updated-active");
			LOGGER.debug(country);
		} catch (NoSuchCountryException e) {
			LOGGER.error(e);
		} catch (PrincipalException e) {
			LOGGER.error(e);
		} catch (SystemException e) {
			LOGGER.error(e);
		}
	}
	
	/**
	 * Update Country
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void updateCountry(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		long countryId = ParamUtil.getLong(actionRequest, "countryId");
		boolean isActive = ParamUtil.getBoolean(actionRequest, "active");
		boolean isZipRequired = ParamUtil.getBoolean(actionRequest, "zipRequired");
		
		String name = ParamUtil.getString(actionRequest, "name");
		String a2 = ParamUtil.getString(actionRequest, "a2");
		String a3 = ParamUtil.getString(actionRequest, "a3");
		String number = ParamUtil.getString(actionRequest, "number");
		String idd = ParamUtil.getString(actionRequest, "idd");
		
		try {
			ExtCountryServiceUtil.updateCountry(countryId, isActive, isZipRequired, name, a2, a3, number, idd);
			SessionMessages.add(actionRequest, "country-updated");
		} catch (Exception e) {
			LOGGER.error(e);
			SessionErrors.add(actionRequest,"country-error");
		}
	}
	
	/**
	 * Add Country
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void addCountry(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		
		boolean isActive = ParamUtil.getBoolean(actionRequest, "active");
		boolean isZipRequired = ParamUtil.getBoolean(actionRequest, "zipRequired");
		
		String name = ParamUtil.getString(actionRequest, "name");
		String a2 = ParamUtil.getString(actionRequest, "a2");
		String a3 = ParamUtil.getString(actionRequest, "a3");
		String number = ParamUtil.getString(actionRequest, "number");
		String idd = ParamUtil.getString(actionRequest, "idd");
		
		try {
			ExtCountryServiceUtil.addCountry(isActive, isZipRequired, name, a2, a3, number, idd);
			SessionMessages.add(actionRequest, "country-added");
		} catch (Exception e) {
			LOGGER.error(e);
			SessionErrors.add(actionRequest,"country-error");
		}
	}
	
}
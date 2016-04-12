package com.gleo.plugins.hexiagon.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Country;
import com.liferay.portal.service.CountryServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;

public class CountryUtil {

	/**
	 * AnnouncementController Logger.
	 */
	protected static Log LOGGER = LogFactoryUtil.getLog(CountryUtil.class);

	private CountryUtil() {

		super();
	}

	public static long getCountryIdByLocal(long countryId,
			ThemeDisplay themeDisplay) {
		if (countryId <= 0 && themeDisplay.isSignedIn()) {
			try {
				Country country = CountryServiceUtil.getCountryByA2(themeDisplay.getLocale().getCountry());
				if (Validator.isNotNull(country)) {
					countryId = country.getCountryId();
				}
			} catch (PortalException e) {
				LOGGER.error(e);
			} catch (SystemException e) {
				LOGGER.error(e);
			}
		}
		return countryId;
	}
}

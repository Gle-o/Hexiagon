package com.gleo.plugins.hexiagon.service.http;

import com.gleo.plugins.hexiagon.service.ExtCountryServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.gleo.plugins.hexiagon.service.ExtCountryServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author guillaumelenoir
 * @see ExtCountryServiceHttp
 * @see com.gleo.plugins.hexiagon.service.ExtCountryServiceUtil
 * @generated
 */
public class ExtCountryServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(ExtCountryServiceSoap.class);

    public static com.liferay.portal.model.Country setActive(long countryId,
        boolean active) throws RemoteException {
        try {
            com.liferay.portal.model.Country returnValue = ExtCountryServiceUtil.setActive(countryId,
                    active);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.Country addCountry(
        boolean isActive, boolean isZipRequired, java.lang.String name,
        java.lang.String a2, java.lang.String a3, java.lang.String number,
        java.lang.String idd) throws RemoteException {
        try {
            com.liferay.portal.model.Country returnValue = ExtCountryServiceUtil.addCountry(isActive,
                    isZipRequired, name, a2, a3, number, idd);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.Country updateCountry(
        long countryId, boolean isActive, boolean isZipRequired,
        java.lang.String name, java.lang.String a2, java.lang.String a3,
        java.lang.String number, java.lang.String idd)
        throws RemoteException {
        try {
            com.liferay.portal.model.Country returnValue = ExtCountryServiceUtil.updateCountry(countryId,
                    isActive, isZipRequired, name, a2, a3, number, idd);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static int getCountriesCount() throws RemoteException {
        try {
            int returnValue = ExtCountryServiceUtil.getCountriesCount();

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.Country[] getCountries(int start,
        int end) throws RemoteException {
        try {
            java.util.List<com.liferay.portal.model.Country> returnValue = ExtCountryServiceUtil.getCountries(start,
                    end);

            return returnValue.toArray(new com.liferay.portal.model.Country[returnValue.size()]);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.Country[] getCountries(int start,
        int end, com.liferay.portal.kernel.util.OrderByComparator byComparator)
        throws RemoteException {
        try {
            java.util.List<com.liferay.portal.model.Country> returnValue = ExtCountryServiceUtil.getCountries(start,
                    end, byComparator);

            return returnValue.toArray(new com.liferay.portal.model.Country[returnValue.size()]);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}

package com.gleo.plugins.hexiagon.service.http;

import com.gleo.plugins.hexiagon.service.ExtRegionServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.gleo.plugins.hexiagon.service.ExtRegionServiceUtil} service utility. The
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
 * @see ExtRegionServiceHttp
 * @see com.gleo.plugins.hexiagon.service.ExtRegionServiceUtil
 * @generated
 */
public class ExtRegionServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(ExtRegionServiceSoap.class);

    public static com.liferay.portal.model.Region setActive(long regionId,
        boolean active) throws RemoteException {
        try {
            com.liferay.portal.model.Region returnValue = ExtRegionServiceUtil.setActive(regionId,
                    active);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.Region updateRegion(long regionId,
        boolean isActive, java.lang.String name, java.lang.String regionCode)
        throws RemoteException {
        try {
            com.liferay.portal.model.Region returnValue = ExtRegionServiceUtil.updateRegion(regionId,
                    isActive, name, regionCode);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static int getRegionsCount(long countryId) throws RemoteException {
        try {
            int returnValue = ExtRegionServiceUtil.getRegionsCount(countryId);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.Region[] getRegions(long countryId,
        int start, int end) throws RemoteException {
        try {
            java.util.List<com.liferay.portal.model.Region> returnValue = ExtRegionServiceUtil.getRegions(countryId,
                    start, end);

            return returnValue.toArray(new com.liferay.portal.model.Region[returnValue.size()]);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.Region[] getRegions(long countryId,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws RemoteException {
        try {
            java.util.List<com.liferay.portal.model.Region> returnValue = ExtRegionServiceUtil.getRegions(countryId,
                    start, end, orderByComparator);

            return returnValue.toArray(new com.liferay.portal.model.Region[returnValue.size()]);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}

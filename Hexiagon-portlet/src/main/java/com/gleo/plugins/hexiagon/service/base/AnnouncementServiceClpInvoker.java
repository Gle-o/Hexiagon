package com.gleo.plugins.hexiagon.service.base;

import com.gleo.plugins.hexiagon.service.AnnouncementServiceUtil;

import java.util.Arrays;

/**
 * @author guillaumelenoir
 * @generated
 */
public class AnnouncementServiceClpInvoker {
    private String _methodName66;
    private String[] _methodParameterTypes66;
    private String _methodName67;
    private String[] _methodParameterTypes67;
    private String _methodName72;
    private String[] _methodParameterTypes72;
    private String _methodName73;
    private String[] _methodParameterTypes73;
    private String _methodName74;
    private String[] _methodParameterTypes74;
    private String _methodName75;
    private String[] _methodParameterTypes75;
    private String _methodName76;
    private String[] _methodParameterTypes76;
    private String _methodName77;
    private String[] _methodParameterTypes77;

    public AnnouncementServiceClpInvoker() {
        _methodName66 = "getBeanIdentifier";

        _methodParameterTypes66 = new String[] {  };

        _methodName67 = "setBeanIdentifier";

        _methodParameterTypes67 = new String[] { "java.lang.String" };

        _methodName72 = "addAnnouncement";

        _methodParameterTypes72 = new String[] {
                "com.gleo.plugins.hexiagon.model.Announcement",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName73 = "updateAnnouncement";

        _methodParameterTypes73 = new String[] {
                "com.gleo.plugins.hexiagon.model.Announcement",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName74 = "deleteAnnouncement";

        _methodParameterTypes74 = new String[] { "long" };

        _methodName75 = "getAnnouncement";

        _methodParameterTypes75 = new String[] { "long" };

        _methodName76 = "getAnnouncementsByGroupId";

        _methodParameterTypes76 = new String[] { "long", "int", "int" };

        _methodName77 = "getAnnouncementsCountByGroupId";

        _methodParameterTypes77 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName66.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
            return AnnouncementServiceUtil.getBeanIdentifier();
        }

        if (_methodName67.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes67, parameterTypes)) {
            AnnouncementServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName72.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
            return AnnouncementServiceUtil.addAnnouncement((com.gleo.plugins.hexiagon.model.Announcement) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName73.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
            return AnnouncementServiceUtil.updateAnnouncement((com.gleo.plugins.hexiagon.model.Announcement) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName74.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
            return AnnouncementServiceUtil.deleteAnnouncement(((Long) arguments[0]).longValue());
        }

        if (_methodName75.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
            return AnnouncementServiceUtil.getAnnouncement(((Long) arguments[0]).longValue());
        }

        if (_methodName76.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
            return AnnouncementServiceUtil.getAnnouncementsByGroupId(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName77.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
            return AnnouncementServiceUtil.getAnnouncementsCountByGroupId(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}

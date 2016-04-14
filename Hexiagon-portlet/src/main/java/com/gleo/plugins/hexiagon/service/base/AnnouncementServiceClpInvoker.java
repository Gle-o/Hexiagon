package com.gleo.plugins.hexiagon.service.base;

import com.gleo.plugins.hexiagon.service.AnnouncementServiceUtil;

import java.util.Arrays;

/**
 * @author guillaumelenoir
 * @generated
 */
public class AnnouncementServiceClpInvoker {
    private String _methodName68;
    private String[] _methodParameterTypes68;
    private String _methodName69;
    private String[] _methodParameterTypes69;
    private String _methodName74;
    private String[] _methodParameterTypes74;
    private String _methodName75;
    private String[] _methodParameterTypes75;
    private String _methodName76;
    private String[] _methodParameterTypes76;
    private String _methodName77;
    private String[] _methodParameterTypes77;
    private String _methodName78;
    private String[] _methodParameterTypes78;
    private String _methodName79;
    private String[] _methodParameterTypes79;

    public AnnouncementServiceClpInvoker() {
        _methodName68 = "getBeanIdentifier";

        _methodParameterTypes68 = new String[] {  };

        _methodName69 = "setBeanIdentifier";

        _methodParameterTypes69 = new String[] { "java.lang.String" };

        _methodName74 = "addAnnouncement";

        _methodParameterTypes74 = new String[] {
                "com.gleo.plugins.hexiagon.model.Announcement",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName75 = "updateAnnouncement";

        _methodParameterTypes75 = new String[] {
                "com.gleo.plugins.hexiagon.model.Announcement",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName76 = "deleteAnnouncement";

        _methodParameterTypes76 = new String[] { "long" };

        _methodName77 = "getAnnouncement";

        _methodParameterTypes77 = new String[] { "long" };

        _methodName78 = "getAnnouncementsByGroupId";

        _methodParameterTypes78 = new String[] { "long", "int", "int" };

        _methodName79 = "getAnnouncementsCountByGroupId";

        _methodParameterTypes79 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName68.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
            return AnnouncementServiceUtil.getBeanIdentifier();
        }

        if (_methodName69.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
            AnnouncementServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName74.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
            return AnnouncementServiceUtil.addAnnouncement((com.gleo.plugins.hexiagon.model.Announcement) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName75.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
            return AnnouncementServiceUtil.updateAnnouncement((com.gleo.plugins.hexiagon.model.Announcement) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName76.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
            return AnnouncementServiceUtil.deleteAnnouncement(((Long) arguments[0]).longValue());
        }

        if (_methodName77.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
            return AnnouncementServiceUtil.getAnnouncement(((Long) arguments[0]).longValue());
        }

        if (_methodName78.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
            return AnnouncementServiceUtil.getAnnouncementsByGroupId(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName79.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
            return AnnouncementServiceUtil.getAnnouncementsCountByGroupId(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}

package com.gleo.plugins.hexiagon.service.base;

import com.gleo.plugins.hexiagon.service.AnnouncementLocalServiceUtil;

import java.util.Arrays;

/**
 * @author guillaumelenoir
 * @generated
 */
public class AnnouncementLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;
    private String _methodName88;
    private String[] _methodParameterTypes88;
    private String _methodName89;
    private String[] _methodParameterTypes89;
    private String _methodName94;
    private String[] _methodParameterTypes94;
    private String _methodName95;
    private String[] _methodParameterTypes95;
    private String _methodName96;
    private String[] _methodParameterTypes96;
    private String _methodName97;
    private String[] _methodParameterTypes97;
    private String _methodName98;
    private String[] _methodParameterTypes98;
    private String _methodName99;
    private String[] _methodParameterTypes99;
    private String _methodName100;
    private String[] _methodParameterTypes100;
    private String _methodName101;
    private String[] _methodParameterTypes101;
    private String _methodName102;
    private String[] _methodParameterTypes102;
    private String _methodName103;
    private String[] _methodParameterTypes103;
    private String _methodName104;
    private String[] _methodParameterTypes104;
    private String _methodName105;
    private String[] _methodParameterTypes105;
    private String _methodName106;
    private String[] _methodParameterTypes106;
    private String _methodName107;
    private String[] _methodParameterTypes107;
    private String _methodName108;
    private String[] _methodParameterTypes108;

    public AnnouncementLocalServiceClpInvoker() {
        _methodName0 = "addAnnouncement";

        _methodParameterTypes0 = new String[] {
                "com.gleo.plugins.hexiagon.model.Announcement"
            };

        _methodName1 = "createAnnouncement";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteAnnouncement";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteAnnouncement";

        _methodParameterTypes3 = new String[] {
                "com.gleo.plugins.hexiagon.model.Announcement"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchAnnouncement";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "fetchAnnouncementByUuidAndCompanyId";

        _methodParameterTypes11 = new String[] { "java.lang.String", "long" };

        _methodName12 = "fetchAnnouncementByUuidAndGroupId";

        _methodParameterTypes12 = new String[] { "java.lang.String", "long" };

        _methodName13 = "getAnnouncement";

        _methodParameterTypes13 = new String[] { "long" };

        _methodName14 = "getPersistedModel";

        _methodParameterTypes14 = new String[] { "java.io.Serializable" };

        _methodName15 = "getAnnouncementByUuidAndCompanyId";

        _methodParameterTypes15 = new String[] { "java.lang.String", "long" };

        _methodName16 = "getAnnouncementByUuidAndGroupId";

        _methodParameterTypes16 = new String[] { "java.lang.String", "long" };

        _methodName17 = "getAnnouncements";

        _methodParameterTypes17 = new String[] { "int", "int" };

        _methodName18 = "getAnnouncementsCount";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "updateAnnouncement";

        _methodParameterTypes19 = new String[] {
                "com.gleo.plugins.hexiagon.model.Announcement"
            };

        _methodName88 = "getBeanIdentifier";

        _methodParameterTypes88 = new String[] {  };

        _methodName89 = "setBeanIdentifier";

        _methodParameterTypes89 = new String[] { "java.lang.String" };

        _methodName94 = "addAnnouncement";

        _methodParameterTypes94 = new String[] {
                "com.gleo.plugins.hexiagon.model.Announcement",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName95 = "updateAsset";

        _methodParameterTypes95 = new String[] {
                "long", "com.gleo.plugins.hexiagon.model.Announcement",
                "long[][]", "java.lang.String[][]", "long[][]"
            };

        _methodName96 = "deleteAnnouncement";

        _methodParameterTypes96 = new String[] { "long" };

        _methodName97 = "updateAnnouncement";

        _methodParameterTypes97 = new String[] {
                "com.gleo.plugins.hexiagon.model.Announcement",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName98 = "getAnnouncementsByGroupId";

        _methodParameterTypes98 = new String[] { "long" };

        _methodName99 = "getAnnouncementsByGroupId";

        _methodParameterTypes99 = new String[] { "long", "int", "int" };

        _methodName100 = "getAnnouncementsCountByGroupId";

        _methodParameterTypes100 = new String[] { "long" };

        _methodName101 = "getAnnouncementsByTypeId";

        _methodParameterTypes101 = new String[] { "long" };

        _methodName102 = "getAnnouncementsCountByTypeId";

        _methodParameterTypes102 = new String[] { "long" };

        _methodName103 = "getAnnouncementsByCurrencyId";

        _methodParameterTypes103 = new String[] { "long" };

        _methodName104 = "getAnnouncementsCountByCurrencyId";

        _methodParameterTypes104 = new String[] { "long" };

        _methodName105 = "updateAnnouncement";

        _methodParameterTypes105 = new String[] {
                "com.gleo.plugins.hexiagon.model.Announcement"
            };

        _methodName106 = "updateStatus";

        _methodParameterTypes106 = new String[] {
                "long", "long", "int",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName107 = "deleteAnnouncements";

        _methodParameterTypes107 = new String[] { "java.util.List" };

        _methodName108 = "getFavoritesAnnouncementsByGroupIUserId";

        _methodParameterTypes108 = new String[] { "long", "long", "int", "int" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return AnnouncementLocalServiceUtil.addAnnouncement((com.gleo.plugins.hexiagon.model.Announcement) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return AnnouncementLocalServiceUtil.createAnnouncement(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return AnnouncementLocalServiceUtil.deleteAnnouncement(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return AnnouncementLocalServiceUtil.deleteAnnouncement((com.gleo.plugins.hexiagon.model.Announcement) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return AnnouncementLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return AnnouncementLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return AnnouncementLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return AnnouncementLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return AnnouncementLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return AnnouncementLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return AnnouncementLocalServiceUtil.fetchAnnouncement(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return AnnouncementLocalServiceUtil.fetchAnnouncementByUuidAndCompanyId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return AnnouncementLocalServiceUtil.fetchAnnouncementByUuidAndGroupId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getAnnouncement(((Long) arguments[0]).longValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getAnnouncementByUuidAndCompanyId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName16.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getAnnouncementByUuidAndGroupId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName17.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getAnnouncements(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getAnnouncementsCount();
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            return AnnouncementLocalServiceUtil.updateAnnouncement((com.gleo.plugins.hexiagon.model.Announcement) arguments[0]);
        }

        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            AnnouncementLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName94.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
            return AnnouncementLocalServiceUtil.addAnnouncement((com.gleo.plugins.hexiagon.model.Announcement) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName95.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
            AnnouncementLocalServiceUtil.updateAsset(((Long) arguments[0]).longValue(),
                (com.gleo.plugins.hexiagon.model.Announcement) arguments[1],
                (long[]) arguments[2], (java.lang.String[]) arguments[3],
                (long[]) arguments[4]);

            return null;
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return AnnouncementLocalServiceUtil.deleteAnnouncement(((Long) arguments[0]).longValue());
        }

        if (_methodName97.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
            return AnnouncementLocalServiceUtil.updateAnnouncement((com.gleo.plugins.hexiagon.model.Announcement) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName98.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getAnnouncementsByGroupId(((Long) arguments[0]).longValue());
        }

        if (_methodName99.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getAnnouncementsByGroupId(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName100.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getAnnouncementsCountByGroupId(((Long) arguments[0]).longValue());
        }

        if (_methodName101.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getAnnouncementsByTypeId(((Long) arguments[0]).longValue());
        }

        if (_methodName102.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getAnnouncementsCountByTypeId(((Long) arguments[0]).longValue());
        }

        if (_methodName103.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getAnnouncementsByCurrencyId(((Long) arguments[0]).longValue());
        }

        if (_methodName104.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getAnnouncementsCountByCurrencyId(((Long) arguments[0]).longValue());
        }

        if (_methodName105.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
            return AnnouncementLocalServiceUtil.updateAnnouncement((com.gleo.plugins.hexiagon.model.Announcement) arguments[0]);
        }

        if (_methodName106.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
            return AnnouncementLocalServiceUtil.updateStatus(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.service.ServiceContext) arguments[3]);
        }

        if (_methodName107.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
            AnnouncementLocalServiceUtil.deleteAnnouncements((java.util.List<com.gleo.plugins.hexiagon.model.Announcement>) arguments[0]);

            return null;
        }

        if (_methodName108.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
            return AnnouncementLocalServiceUtil.getFavoritesAnnouncementsByGroupIUserId(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Integer) arguments[2]).intValue(),
                ((Integer) arguments[3]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}

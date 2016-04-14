package com.gleo.plugins.hexiagon.service.base;

import com.gleo.plugins.hexiagon.service.ExtRegionServiceUtil;

import java.util.Arrays;

/**
 * @author guillaumelenoir
 * @generated
 */
public class ExtRegionServiceClpInvoker {
    private String _methodName50;
    private String[] _methodParameterTypes50;
    private String _methodName51;
    private String[] _methodParameterTypes51;
    private String _methodName54;
    private String[] _methodParameterTypes54;
    private String _methodName55;
    private String[] _methodParameterTypes55;
    private String _methodName56;
    private String[] _methodParameterTypes56;
    private String _methodName57;
    private String[] _methodParameterTypes57;
    private String _methodName58;
    private String[] _methodParameterTypes58;

    public ExtRegionServiceClpInvoker() {
        _methodName50 = "getBeanIdentifier";

        _methodParameterTypes50 = new String[] {  };

        _methodName51 = "setBeanIdentifier";

        _methodParameterTypes51 = new String[] { "java.lang.String" };

        _methodName54 = "setActive";

        _methodParameterTypes54 = new String[] { "long", "boolean" };

        _methodName55 = "updateRegion";

        _methodParameterTypes55 = new String[] {
                "long", "boolean", "java.lang.String", "java.lang.String"
            };

        _methodName56 = "getRegionsCount";

        _methodParameterTypes56 = new String[] { "long" };

        _methodName57 = "getRegions";

        _methodParameterTypes57 = new String[] { "long", "int", "int" };

        _methodName58 = "getRegions";

        _methodParameterTypes58 = new String[] {
                "long", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName50.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
            return ExtRegionServiceUtil.getBeanIdentifier();
        }

        if (_methodName51.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
            ExtRegionServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName54.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
            return ExtRegionServiceUtil.setActive(((Long) arguments[0]).longValue(),
                ((Boolean) arguments[1]).booleanValue());
        }

        if (_methodName55.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
            return ExtRegionServiceUtil.updateRegion(((Long) arguments[0]).longValue(),
                ((Boolean) arguments[1]).booleanValue(),
                (java.lang.String) arguments[2], (java.lang.String) arguments[3]);
        }

        if (_methodName56.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
            return ExtRegionServiceUtil.getRegionsCount(((Long) arguments[0]).longValue());
        }

        if (_methodName57.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
            return ExtRegionServiceUtil.getRegions(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName58.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
            return ExtRegionServiceUtil.getRegions(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        throw new UnsupportedOperationException();
    }
}

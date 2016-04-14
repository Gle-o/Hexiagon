package com.gleo.plugins.hexiagon.service.base;

import com.gleo.plugins.hexiagon.service.ExtCountryServiceUtil;

import java.util.Arrays;

/**
 * @author guillaumelenoir
 * @generated
 */
public class ExtCountryServiceClpInvoker {
    private String _methodName46;
    private String[] _methodParameterTypes46;
    private String _methodName47;
    private String[] _methodParameterTypes47;
    private String _methodName50;
    private String[] _methodParameterTypes50;
    private String _methodName51;
    private String[] _methodParameterTypes51;
    private String _methodName52;
    private String[] _methodParameterTypes52;
    private String _methodName53;
    private String[] _methodParameterTypes53;
    private String _methodName54;
    private String[] _methodParameterTypes54;
    private String _methodName55;
    private String[] _methodParameterTypes55;

    public ExtCountryServiceClpInvoker() {
        _methodName46 = "getBeanIdentifier";

        _methodParameterTypes46 = new String[] {  };

        _methodName47 = "setBeanIdentifier";

        _methodParameterTypes47 = new String[] { "java.lang.String" };

        _methodName50 = "setActive";

        _methodParameterTypes50 = new String[] { "long", "boolean" };

        _methodName51 = "addCountry";

        _methodParameterTypes51 = new String[] {
                "boolean", "boolean", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String"
            };

        _methodName52 = "updateCountry";

        _methodParameterTypes52 = new String[] {
                "long", "boolean", "boolean", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String"
            };

        _methodName53 = "getCountriesCount";

        _methodParameterTypes53 = new String[] {  };

        _methodName54 = "getCountries";

        _methodParameterTypes54 = new String[] { "int", "int" };

        _methodName55 = "getCountries";

        _methodParameterTypes55 = new String[] {
                "int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
            };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName46.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
            return ExtCountryServiceUtil.getBeanIdentifier();
        }

        if (_methodName47.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
            ExtCountryServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName50.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
            return ExtCountryServiceUtil.setActive(((Long) arguments[0]).longValue(),
                ((Boolean) arguments[1]).booleanValue());
        }

        if (_methodName51.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
            return ExtCountryServiceUtil.addCountry(((Boolean) arguments[0]).booleanValue(),
                ((Boolean) arguments[1]).booleanValue(),
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5], (java.lang.String) arguments[6]);
        }

        if (_methodName52.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
            return ExtCountryServiceUtil.updateCountry(((Long) arguments[0]).longValue(),
                ((Boolean) arguments[1]).booleanValue(),
                ((Boolean) arguments[2]).booleanValue(),
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5],
                (java.lang.String) arguments[6], (java.lang.String) arguments[7]);
        }

        if (_methodName53.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
            return ExtCountryServiceUtil.getCountriesCount();
        }

        if (_methodName54.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
            return ExtCountryServiceUtil.getCountries(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName55.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
            return ExtCountryServiceUtil.getCountries(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[2]);
        }

        throw new UnsupportedOperationException();
    }
}

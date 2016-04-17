package com.gleo.plugins.hexiagon.service.base;

import com.gleo.plugins.hexiagon.service.CurrencyServiceUtil;

import java.util.Arrays;

/**
 * @author guillaumelenoir
 * @generated
 */
public class CurrencyServiceClpInvoker {
    private String _methodName46;
    private String[] _methodParameterTypes46;
    private String _methodName47;
    private String[] _methodParameterTypes47;
    private String _methodName52;
    private String[] _methodParameterTypes52;
    private String _methodName53;
    private String[] _methodParameterTypes53;
    private String _methodName54;
    private String[] _methodParameterTypes54;

    public CurrencyServiceClpInvoker() {
        _methodName46 = "getBeanIdentifier";

        _methodParameterTypes46 = new String[] {  };

        _methodName47 = "setBeanIdentifier";

        _methodParameterTypes47 = new String[] { "java.lang.String" };

        _methodName52 = "addCurrency";

        _methodParameterTypes52 = new String[] {
                "com.gleo.plugins.hexiagon.model.Currency",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName53 = "updateCurrency";

        _methodParameterTypes53 = new String[] {
                "com.gleo.plugins.hexiagon.model.Currency"
            };

        _methodName54 = "deleteCurrency";

        _methodParameterTypes54 = new String[] {
                "long", "com.liferay.portal.service.ServiceContext"
            };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName46.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
            return CurrencyServiceUtil.getBeanIdentifier();
        }

        if (_methodName47.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
            CurrencyServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName52.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
            return CurrencyServiceUtil.addCurrency((com.gleo.plugins.hexiagon.model.Currency) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName53.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
            return CurrencyServiceUtil.updateCurrency((com.gleo.plugins.hexiagon.model.Currency) arguments[0]);
        }

        if (_methodName54.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
            return CurrencyServiceUtil.deleteCurrency(((Long) arguments[0]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        throw new UnsupportedOperationException();
    }
}

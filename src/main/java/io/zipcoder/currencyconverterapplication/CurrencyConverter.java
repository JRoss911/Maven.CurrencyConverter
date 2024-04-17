package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
    /*
    double a = sourceCurrencyType
     double b = amountOfBaseCurrency
     double c = targetCurrencyType
     double a * b = c || a = c/b

     double amountOfBaseCurrency = targetCurrency/sourceCurrencyType
     */
/*
 CurrencyType targetCurrencyType = ENUM value we are comparing against
 ConvertableCurrency sourceCurrencyType = ENUM value we are starting with
 double amountOfBaseCurrency = money

*/



        return sourceCurrencyType.convert(targetCurrencyType) * amountOfBaseCurrency;
    }
}

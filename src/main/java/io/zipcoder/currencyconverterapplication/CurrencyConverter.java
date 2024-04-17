package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
    /*
    double a = sourceCurrencyType
     double b = amountOfBaseCurrency
     double c = targetCurrencyType
     double a * b = c || a = c/b
    US_DOLLAR / POUND = exchangeRate(1.22)
    return exchangeRate * targetCurrencyType //Gives you
     double amountOfBaseCurrency = targetCurrency/sourceCurrencyType
     */
/*
 CurrencyType targetCurrencyType = ENUM value we are comparing against
 ConvertableCurrency sourceCurrencyType = ENUM value we are starting with
 double amountOfBaseCurrency = currency exchange rate
*/
// when
// Double actual = currency.convert(currencyType);

        return sourceCurrencyType.convert(targetCurrencyType) * amountOfBaseCurrency;
    }
}

package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return Double.MAX_VALUE;
    }
}

//Identify exchange rates between any two currency types
    /*
    double a = currencyType
     double b = exchangeRate
     double c = newCurrencyValue
     double a * b = c && a = c/b
     */


//Use Object orientation and enums
    /*
    ENUMS used for each countries currency
    */
//can not waste any value during exchange
    /*
    Using double data type for more accurate values
    */


package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
//Need to assign ENUM values to each currencyType

    @Override
    public CurrencyType getType() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
}


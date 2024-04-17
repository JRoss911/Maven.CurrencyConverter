package io.zipcoder.currencyconverterapplication;

public enum CurrencyType {
    AUSTRALIAN_DOLLAR(2.70),  //0
    CANADIAN_DOLLAR(2.64),    //1
    CHINESE_YR(13.84),        //2
    EURO(1.88),               //3
    FRANC(2.02),              //4
    POUND(1.64),              //5
    RINGGIT(8.94),            //6
    RUPEE(136.64),            //7
    SINGAPORE_DOLLAR(1.86),   //8
    US_DOLLAR(2.0),           //9
    UNIVERSAL_CURRENCY(1.0),  //10
    YEN(231.68);              //11

    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public Double getRate() { //Gives the exchange rate of the country currency

        return rate;
    }
    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {
        return currency.getType();     //Gives the country currency type
    }
}


package com.crushcod.arbitrage.core.model;

public enum MarketNameType {

    BTC_LTC("BTC-LTC");

    private final String code;

    MarketNameType(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

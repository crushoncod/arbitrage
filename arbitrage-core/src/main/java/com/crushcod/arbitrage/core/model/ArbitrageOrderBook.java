package com.crushcod.arbitrage.core.model;

import java.util.List;

public class ArbitrageOrderBook {

    MarketNameType marketNameType;
    List<ArbitrageOrderBookDetails> result;

    public ArbitrageOrderBook() {
    }

    public ArbitrageOrderBook(MarketNameType marketNameType,
            List<ArbitrageOrderBookDetails> result) {
        this.marketNameType = marketNameType;
        this.result = result;
    }

    public MarketNameType getMarketNameType() {
        return marketNameType;
    }

    public void setMarketNameType(MarketNameType marketNameType) {
        this.marketNameType = marketNameType;
    }

    public List<ArbitrageOrderBookDetails> getResult() {
        return result;
    }

    public void setResult(List<ArbitrageOrderBookDetails> result) {
        this.result = result;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("ArbitrageOrderBook{");
        sb.append("marketNameType=").append(marketNameType);
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }
}

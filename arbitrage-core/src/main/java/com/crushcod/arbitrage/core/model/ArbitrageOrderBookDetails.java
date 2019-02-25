package com.crushcod.arbitrage.core.model;

import java.util.List;

public class ArbitrageOrderBookDetails {

    List<BittrexOrderBookValues> buy;
    List<BittrexOrderBookValues> sell;

    public ArbitrageOrderBookDetails() {
    }

    public ArbitrageOrderBookDetails(List<BittrexOrderBookValues> buy,
            List<BittrexOrderBookValues> sell) {
        this.buy = buy;
        this.sell = sell;
    }

    public List<BittrexOrderBookValues> getBuy() {
        return buy;
    }

    public void setBuy(List<BittrexOrderBookValues> buy) {
        this.buy = buy;
    }

    public List<BittrexOrderBookValues> getSell() {
        return sell;
    }

    public void setSell(List<BittrexOrderBookValues> sell) {
        this.sell = sell;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("ArbitrageOrderBookDetails{");
        sb.append("buy=").append(buy);
        sb.append(", sell=").append(sell);
        sb.append('}');
        return sb.toString();
    }
}

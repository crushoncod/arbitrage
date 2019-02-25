package com.crushcod.arbitrage.core.model.exchange.bittrex;

import java.util.List;

public class BittrexOrderBookDetails {

    List<BittrexOrderBookValues> buy;
    List<BittrexOrderBookValues> sell;

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

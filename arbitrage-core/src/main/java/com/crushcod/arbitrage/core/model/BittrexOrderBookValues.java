package com.crushcod.arbitrage.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class BittrexOrderBookValues {

    BigDecimal quantity;
    BigDecimal rate;

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("BittrexOrderBookValues{");
        sb.append("quantity=").append(quantity);
        sb.append(", rate=").append(rate);
        sb.append('}');
        return sb.toString();
    }
}

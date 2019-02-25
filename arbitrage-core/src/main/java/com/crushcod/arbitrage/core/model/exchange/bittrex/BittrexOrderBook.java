package com.crushcod.arbitrage.core.model.exchange.bittrex;

import java.util.List;

public class BittrexOrderBook {

    String success;
    String message;
    List<BittrexOrderBookDetails> result;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<BittrexOrderBookDetails> getResult() {
        return result;
    }

    public void setResult(List<BittrexOrderBookDetails> result) {
        this.result = result;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("ArbitrageOrderBook{");
        sb.append("success='").append(success).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }
}

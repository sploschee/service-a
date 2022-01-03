package com.splosch.servicea.model;

import java.time.LocalDateTime;

/**
 * SpotPrice
 */
public class SpotPrice {
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return LocalDateTime.now() + ": The " + data.getCurrency() + " Spot price of BTC is " + data.getAmount();
    }
}
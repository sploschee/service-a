package com.splosch.servicea.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Data
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    private String base;
    private String amount;
    private String currency;

    public String getBase() {
        return this.base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
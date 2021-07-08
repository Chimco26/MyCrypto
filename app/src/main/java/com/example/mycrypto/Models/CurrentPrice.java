package com.example.mycrypto.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentPrice {
    @SerializedName("eur")
    @Expose
    private Integer eur;

    @SerializedName("ils")
    @Expose
    private Integer ils;

    @SerializedName("usd")
    @Expose
    private Integer usd;

    public Integer getEur() {
        return eur;
    }

    public void setEur(Integer eur) {
        this.eur = eur;
    }

    public Integer getIls() {
        return ils;
    }

    public void setIls(Integer ils) {
        this.ils = ils;
    }

    public Integer getUsd() {
        return usd;
    }

    public void setUsd(Integer usd) {
        this.usd = usd;
    }
}

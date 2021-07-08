package com.example.mycrypto.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentPrice {
    @SerializedName("eur")
    @Expose
    private double eur;

    @SerializedName("ils")
    @Expose
    private double ils;

    @SerializedName("usd")
    @Expose
    private double usd;

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    public double getIls() {
        return ils;
    }

    public void setIls(Integer ils) {
        this.ils = ils;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(Integer usd) {
        this.usd = usd;
    }
}

package com.example.mycrypto.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MarketData {
    @SerializedName("current_price")
    @Expose
    private CurrentPrice currentPrice;

    public CurrentPrice getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(CurrentPrice currentPrice) {
        this.currentPrice = currentPrice;
    }
}

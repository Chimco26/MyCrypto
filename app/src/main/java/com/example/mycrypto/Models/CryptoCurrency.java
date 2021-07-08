package com.example.mycrypto.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CryptoCurrency {
    @SerializedName("infoData")
    @Expose
    private InfoData infoData;

    public InfoData getInfoData() {
        return infoData;
    }

    public void setInfoData(InfoData infoData) {
        this.infoData = infoData;
    }
}

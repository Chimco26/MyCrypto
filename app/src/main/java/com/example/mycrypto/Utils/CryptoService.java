package com.example.mycrypto.Utils;

import com.example.mycrypto.Models.CryptoCurrency;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface CryptoService {
    @GET()
    Call<List<CryptoCurrency>> getCurrencies();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.coingecko.com/api/v3/coins/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}

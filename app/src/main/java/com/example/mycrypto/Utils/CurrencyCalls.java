package com.example.mycrypto.Utils;

import com.example.mycrypto.Models.CryptoCurrency;

import java.lang.ref.WeakReference;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrencyCalls {
    public interface Callbacks{
        void onResponse(List<CryptoCurrency> currencies);
        void onFailure();
    }

    public static void fetchCurrencies(Callbacks callbacks){
        final WeakReference<Callbacks> callbacksWeakReference = new WeakReference<>(callbacks);

        CryptoService cryptoService = CryptoService.retrofit.create(CryptoService.class);

        Call<List<CryptoCurrency>> call = cryptoService.getCurrencies();
        call.enqueue(new Callback<List<CryptoCurrency>>() {
            @Override
            public void onResponse(Call<List<CryptoCurrency>> call, Response<List<CryptoCurrency>> response) {
                if (response.body() == null){
                    callbacksWeakReference.get().onFailure();
                }else if (callbacksWeakReference.get() != null)
                    callbacksWeakReference.get().onResponse(response.body());
            }
            @Override
            public void onFailure(Call<List<CryptoCurrency>> call, Throwable t) {
                if (callbacksWeakReference.get() != null)
                    callbacksWeakReference.get().onFailure();
            }
        });
    }
}

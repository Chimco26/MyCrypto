package com.example.mycrypto.Views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mycrypto.Models.CryptoCurrency;
import com.example.mycrypto.R;

import java.util.List;

public class CryptoAdapter extends RecyclerView.Adapter<CryptoViewHolder> {

    private List<CryptoCurrency> cryptoList;

    public CryptoAdapter(List<CryptoCurrency> cryptoList) {
        this.cryptoList = cryptoList;
    }

    @Override
    public CryptoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_currency, parent, false);

        return new CryptoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CryptoViewHolder holder, int position) {
        holder.updateItemWithCrypto(this.cryptoList.get(position));

    }

    @Override
    public int getItemCount() {
        return cryptoList.size();
    }
}

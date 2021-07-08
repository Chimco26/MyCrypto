package com.example.mycrypto.Views;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mycrypto.Models.CryptoCurrency;
import com.example.mycrypto.R;
import com.squareup.picasso.Picasso;

public class CryptoViewHolder extends RecyclerView.ViewHolder {

    TextView textSymbol;
    TextView usdPrice;
    TextView eurPrice;
    TextView ilsPrice;
    ImageView image;
    Picasso picasso;

    public CryptoViewHolder(View itemView) {
        super(itemView);

        textSymbol = itemView.findViewById(R.id.item_symbol);
        usdPrice = itemView.findViewById(R.id.usd_price);
        eurPrice = itemView.findViewById(R.id.eur_price);
        ilsPrice = itemView.findViewById(R.id.ils_price);
        image = itemView.findViewById(R.id.item_image);
    }

    public void updateItemWithCrypto(CryptoCurrency cryptoCurrency){
        textSymbol.setText(cryptoCurrency.getInfoData().getSymbol());
        usdPrice.setText(cryptoCurrency.getInfoData().getMarketData().getCurrentPrice().getUsd());
        eurPrice.setText(cryptoCurrency.getInfoData().getMarketData().getCurrentPrice().getEur());
        ilsPrice.setText(cryptoCurrency.getInfoData().getMarketData().getCurrentPrice().getIls());
        picasso.load(cryptoCurrency.getInfoData().getImage().getSmall()).into(image);
    }
}

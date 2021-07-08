package com.example.mycrypto.Controllers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;

import com.example.mycrypto.Models.CryptoCurrency;
import com.example.mycrypto.R;
import com.example.mycrypto.Utils.CurrencyCalls;
import com.example.mycrypto.Views.CryptoAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CurrencyCalls.Callbacks {

    private List<CryptoCurrency> cryptoList;
    private CryptoAdapter adapter;
    RecyclerView recyclerView;
    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.my_recycler_view);
        swipeRefreshLayout = findViewById(R.id.my_swip_container);
        configureRecyclerView();

    }

    private void configureRecyclerView(){
        cryptoList = new ArrayList<>();
        adapter = new CryptoAdapter(this.cryptoList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onResponse(List<CryptoCurrency> currencies) {
        System.out.println("SYMBOL :"+currencies.get(0).getInfoData().getSymbol());
        swipeRefreshLayout.setRefreshing(false);
        cryptoList.clear();
        cryptoList.addAll(currencies);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onFailure() {

    }
}
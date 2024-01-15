package com.joincoded.mycurrency;

import static com.joincoded.mycurrency.R.id.RecyclerViewCurrency;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.joincoded.mycurrency.CurrencyData.CurrencyData;
import com.joincoded.mycurrency.Newcurrency.CurrencyAdapt;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewCurrency;

    ArrayList<CurrencyData> currencyLists = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addCurrency();
        recyclerViewCurrency = findViewById(R.id.RecyclerViewCurrency);
        recyclerViewCurrency.setLayoutManager(new LinearLayoutManager(this));
        CurrencyAdapt currencyAdapt = new CurrencyAdapt(currencyLists);
        recyclerViewCurrency.setAdapter(currencyAdapt);


    }

    private void addCurrency() {
        currencyLists.add(new CurrencyData("US Dollar: ", "USD", 0.31));
        currencyLists.add(new CurrencyData("Euro:", "EUR", 0.34));
        currencyLists.add(new CurrencyData("Japanese Yen:", "YEN", 0.0021));

    }


}

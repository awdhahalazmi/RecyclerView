package com.joincoded.mycurrency.Newcurrency;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joincoded.mycurrency.CurrencyData.CurrencyData;
import com.joincoded.mycurrency.R;

import java.util.ArrayList;

public class CurrencyAdapt extends RecyclerView.Adapter<CurrencyAdapt.CurrencyHolderr>{
    ArrayList<CurrencyData> currencyssLists;
    public CurrencyAdapt(ArrayList<CurrencyData> currencyssLists) {
        this.currencyssLists = currencyssLists;
    }
    @NonNull
    @Override
    public CurrencyHolderr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1,parent,false);
        return new CurrencyHolderr(item);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyHolderr holder, int position) {
        holder.exchangeTextView.setText(String.valueOf(currencyssLists.get(position).getExchange()) );
        holder.codeTextView.setText(currencyssLists.get(position).getCode());
        holder.nameTextView.setText(currencyssLists.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return currencyssLists.size();
    }
   public static class CurrencyHolderr extends  RecyclerView.ViewHolder {
    TextView nameTextView;
    TextView codeTextView;
    TextView exchangeTextView;

       public CurrencyHolderr(@NonNull View itemView) {
           super(itemView);
           nameTextView = itemView.findViewById(R.id.CurrencytextView);
           codeTextView = itemView.findViewById(R.id.CodetextView2);
           exchangeTextView = itemView.findViewById(R.id.ExchangeTextView);

       }
   }



}


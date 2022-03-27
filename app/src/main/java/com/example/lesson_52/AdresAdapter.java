package com.example.lesson_52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdresAdapter extends RecyclerView.Adapter<AdresAdapter.AdresViewHolder> {

    private ArrayList<String> list;

    public AdresAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public AdresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdresViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adres, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdresViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class AdresViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public AdresViewHolder(@NonNull View itemView) {
            super(itemView);
            textView =itemView.findViewById(R.id.adress);
        }

        public void bind(String s) {
            textView.setText(s);
        }
    }
}

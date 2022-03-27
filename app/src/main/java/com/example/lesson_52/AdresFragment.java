package com.example.lesson_52;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class AdresFragment extends Fragment {

    private AdresAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<String> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_adres, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler);
        arrayList = new ArrayList<>();
        arrayList.add("Bokonbaeva");
        arrayList.add("Bokonbaeva");
        arrayList.add("Bokonbaeva");
        arrayList.add("Bokonbaeva");
        arrayList.add("Kievskaya");
        arrayList.add("Kievskaya");
        arrayList.add("Kievskaya");
        arrayList.add("Kievskaya");
        arrayList.add("Ahunbaeva");
        arrayList.add("Ahunbaeva");
        arrayList.add("Ahunbaeva");
        arrayList.add("Ahunbaeva");
        arrayList.add("Belinka");
        arrayList.add("Belinka");
        arrayList.add("Belinka");
        arrayList.add("Belinka");
        arrayList.add("Karpinka");
        arrayList.add("Karpinka");
        arrayList.add("Karpinka");
        arrayList.add("Karpinka");
        adapter = new AdresAdapter(arrayList);
        recyclerView.setAdapter(adapter);


    }
}
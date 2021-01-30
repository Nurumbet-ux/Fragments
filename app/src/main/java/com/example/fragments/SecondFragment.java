package com.example.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment {
    private RecyclerView recyclerView;
    IForConnection iForConnection;
    private ArrayList<Models> list = new ArrayList<>();
    private Adapter adapter;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        iForConnection = (IForConnection) context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        adapter = new Adapter(list, getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    public void add(Models model) {
        list.add(model);
        adapter.notifyDataSetChanged();
    }


}
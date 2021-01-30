package com.example.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {
    private Button btnHide;
    private Button btnShow;
    private IForConnection iForConnection;

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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        btnHide = view.findViewById(R.id.btnHide);
        btnShow = view.findViewById(R.id.btnShow);

        btnHide.setOnClickListener(v -> {
            iForConnection.hide();
        });

        btnShow.setOnClickListener(v -> {
            iForConnection.show();
        });
        return view;
    }


}
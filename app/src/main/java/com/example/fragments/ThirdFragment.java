package com.example.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ThirdFragment extends Fragment {
    private IForConnection iForConnection;
    private EditText etText;
    private Button btn;

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
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        etText = view.findViewById(R.id.etText);
        btn = view.findViewById(R.id.btnAdd);
        btn.setOnClickListener(v -> {
            String word = etText.getText().toString();
            iForConnection.add(word);
        });
        return view;
    }
}
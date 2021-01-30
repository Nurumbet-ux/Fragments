package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IForConnection {
    private FragmentTransaction fragmentTransaction;
    private FirstFragment firstFragment;
    private SecondFragment secondFragment;
    private ThirdFragment thirdFragment;
    private ArrayList<Models> list = new ArrayList<>();
    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.placeHolder1, firstFragment);
        fragmentTransaction.add(R.id.placeHolder2, secondFragment);
        fragmentTransaction.add(R.id.placeHolder3, thirdFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void hide() {
        layout = findViewById(R.id.parent);
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.hide(secondFragment);
        layout.setVisibility(View.GONE);
    }

    @Override
    public void show() {
        layout = findViewById(R.id.parent);
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.show(secondFragment);
        layout.setVisibility(View.VISIBLE);
    }

    @Override
    public void add(String word) {
        secondFragment.add(new Models(word));
    }
}
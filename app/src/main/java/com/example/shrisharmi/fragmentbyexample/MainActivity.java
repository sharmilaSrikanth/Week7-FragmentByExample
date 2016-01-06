package com.example.shrisharmi.fragmentbyexample;

import android.app.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends android.support.v4.app.Fragment {
    android.support.v4.app.Fragment fragment;
    Button btn1, btn2, btn3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        android.support.v4.app.FragmentManager fm = getFragmentManager();
        android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
        StartFragment myFragment = new StartFragment();

        ft.add(R.id.myFragment, fragment);
        ft.commit();
        btn1.setOnClickListener(btnOnClickListener);
        btn2.setOnClickListener(btnOnClickListener);
        btn3.setOnClickListener(btnOnClickListener);

    }

    Button.OnClickListener btnOnClickListener = new Button.OnClickListener() {
        public void onClick(View v) {

            android.support.v4.app.Fragment newFragment;
            if (v == btn1) {
                newFragment = new Fragment1();
            } else if (v == btn2) {
                newFragment = new Fragment2();


            } else if (v == btn3) {
                newFragment = new Fragment3();
            } else {
                newFragment = new StartFragment();
            }
            android.support.v4.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.myFragment, newFragment);
            transaction.addToBackStack(null);
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            transaction.commit();


        }

    };
}



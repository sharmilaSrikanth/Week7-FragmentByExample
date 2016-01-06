package com.example.shrisharmi.fragmentbyexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shrisharmi on 1/3/2016.
 */
public class Fragment1 extends AppCompatActivity {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancState){
        return inflater.inflate(R.layout.fragment_1,container,false);
    }
}

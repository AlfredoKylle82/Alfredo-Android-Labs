package com.example.algonquin.cst2335.nava0082.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.algonquin.cst2335.nava0082.R;
import com.example.algonquin.cst2335.nava0082.databinding.ActivityMainBinding;

import com.example.algonquin.cst2335.nava0082.data.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding variableBinding;
    private MainViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());

        model = new ViewModelProvider(this).get(MainViewModel.class);


        variableBinding.mybutton.setOnClickListener(click ->
        {
            model.editString.observe(this, s->{
                variableBinding.textview.setText("your edit text has: "+s);
            });
        });
    }
}
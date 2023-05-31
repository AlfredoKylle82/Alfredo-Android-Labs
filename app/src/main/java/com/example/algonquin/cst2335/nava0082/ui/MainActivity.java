package com.example.algonquin.cst2335.nava0082.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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


        model = new ViewModelProvider(this).get(MainViewModel.class);

        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = (button, isChecked) -> {
            model.setIsSelected(isChecked);
        };

        model.getIsSelected().observe(this, selected->{
            variableBinding.checkBox.setOnCheckedChangeListener(null);
            variableBinding.radioButton.setOnCheckedChangeListener(null);
            variableBinding.switchButton.setOnCheckedChangeListener(null);


            variableBinding.checkBox.setChecked(selected);
            variableBinding.radioButton.setChecked(selected);
            variableBinding.switchButton.setChecked(selected);

            variableBinding.checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
            variableBinding.radioButton.setOnCheckedChangeListener(onCheckedChangeListener);
            variableBinding.switchButton.setOnCheckedChangeListener(onCheckedChangeListener);
        });

        variableBinding.checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
        variableBinding.radioButton.setOnCheckedChangeListener(onCheckedChangeListener);
        variableBinding.switchButton.setOnCheckedChangeListener(onCheckedChangeListener);

        variableBinding.myimagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int width = view.getWidth();
                int height = view.getHeight();
                String message = "The width = " + width + " and height = " + height;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

        setContentView(variableBinding.getRoot());
    }
}
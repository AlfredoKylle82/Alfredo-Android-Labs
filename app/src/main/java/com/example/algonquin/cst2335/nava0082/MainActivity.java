package com.example.algonquin.cst2335.nava0082;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.algonquin.cst2335.nava0082.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding variableBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // create a binding object
        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());

        // loads XML file on the page
        setContentView(variableBinding.getRoot());

        // creates a SharedPreferences object
        SharedPreferences prefs = getSharedPreferences("myData", MODE_PRIVATE);
        variableBinding.emailEditText.setText(prefs.getString("EmailAddress", ""));

        // on click listener
        variableBinding.loginButton.setOnClickListener(clk -> {
            // variable for the email address
            EditText email = variableBinding.emailEditText;

            // from where you are, to where you want to go
            Intent nextPage = new Intent(MainActivity.this, SecondActivity.class);
            nextPage.putExtra("EmailAddress", email.getText().toString());

            // does the transition
            startActivity(nextPage);


            Log.w("MainActivity", "In onCreate() - Loading Widgets");
        });

        super.onCreate(savedInstanceState);


    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.w( "MainActivity", "In onCreate() - Application now visible on screen" );
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.w( "MainActivity", "In onCreate() - The application now responding to user input" );
    }

    @Override
    protected void onPause(){
        super.onPause();
        // saves the email address into Shared Preferences
        SharedPreferences.Editor editor = getSharedPreferences("myData", Context.MODE_PRIVATE).edit();
        editor.putString("EmailAddress", variableBinding.emailEditText.getText().toString());
        editor.apply();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );
    }
}
package com.example.algonquin.cst2335.nava0082;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * MainActivity is the main screen of the app where the user can input password.
 * It provides functionality for checking the complexity of the password.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Called when the activity is starting. This is where most initialization
     * happens: calling setContentView(int) to inflate the activity's UI, and
     * finding views by their ID.
     *
     * @param savedInstanceState If the activity is being re-initialized after previously
     *                           being shut down then this Bundle contains the data it most recently supplied.
     *                           Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}

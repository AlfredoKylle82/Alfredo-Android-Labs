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
     * being shut down then this Bundle contains the data it most recently supplied.
     * Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.textView);
        EditText et = findViewById(R.id.editText);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener( clk ->{
            String password = et.getText().toString();
            checkPasswordComplexity( password );
            if(checkPasswordComplexity(password)) {
                tv.setText("Your password meets the requirements");
            } else
                tv.setText("You shall not pass!");
        });
    }

    /**
     * This function is for validating password complexity. It checks whether
     * the password contains an uppercase letter, a lowercase letter, a number, and a special character.
     * If the password misses any of these, a toast message is displayed to the user and the function
     * returns false. If the password meets all conditions, the function returns true.
     *
     * @param password the string object that we are checking
     * @return Returns true if the password meets the complexity required, otherwise returns false
     */
    boolean checkPasswordComplexity(String password) {
        boolean foundUpperCase, foundLowerCase, foundNumber, foundSpecial;

        foundUpperCase = foundLowerCase = foundNumber = foundSpecial = false;

        if(!foundUpperCase)
        {
            Toast.makeText(this, "You are missing an upper case letter", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(!foundLowerCase)
        {
            Toast.makeText(this, "You are missing a lower case letter", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(!foundNumber)
        {
            Toast.makeText(this, "You are missing a number", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(!foundSpecial)
        {
            Toast.makeText(this, "You are missing a special character", Toast.LENGTH_SHORT).show();
            return false;
        }
        else
        {
            return true; //only get here if they're all true
        }
    }

    /**
     * Checks whether the given character is a special character.
     *
     * @param c the character to be checked
     * @return Returns true if the character is one of: #$%^&*!@?, otherwise returns false
     */
    boolean isSpecialCharacter(char c)
    {
        return "#$%^&*!@?".indexOf(c) != -1;
    }
}

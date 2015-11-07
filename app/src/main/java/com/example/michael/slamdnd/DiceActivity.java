package com.example.michael.slamdnd;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button roll = (Button)findViewById(R.id.btnRoll);


    }

    public void roll()
    {
        // Grabs value from spinner
        Spinner spin=(Spinner)findViewById(R.id.spinner);   // Spinner Instance
        String text = spin.getSelectedItem().toString();    // Gets spinner input
        int n = 0;                                          // Dice choice range
        if(text.equals("D_4"))
            n = 4;
        else if(text.equals("D_6"))
            n = 6;
        else if(text.equals("D_8"))
            n = 8;
        else if(text.equals("D_10"))
            n = 10;
        else if(text.equals("D_12"))
            n = 12;
        else if(text.equals("D_20"))
            n = 20;
        else
            n = 100;

        TextView result = (TextView)findViewById(R.id.output);  // TextView(output) Instance
        EditText edit = (EditText)findViewById(R.id.editText2); // EditText Instance
        String s = edit.getText().toString();                   // Grabs string from the instance
        int m = Integer.parseInt(s);                            // Converts string to integer

        Random rand = new Random();                             // Random Instance
        int random = 0;                                         // Random Integer Variable
        for(int i = 0; i < m; i++)                              // Iterates 'm' times
        {
            random = rand.nextInt(n)+1;                         // Gets a random number in a given range
            result.setText(random + ",");
        }
    }

}

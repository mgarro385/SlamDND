package com.example.michael.slamdnd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class EncounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encounter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button encounter = (Button)findViewById(R.id.button);


    }

    public void Encounter_Click(View view)
    {
        TextView t = (TextView)findViewById(R.id.textView);
        Spinner mySpinner = (Spinner)findViewById(R.id.spinRegion);

        String txtFromSpinner = mySpinner.getSelectedItem().toString();

        if(txtFromSpinner.equals("Plains"))
        {
            Encounter_Archive encounter = new Encounter_Archive();
            encounter.plainsPopulation();
            String x = encounter.selectPlain();
            t.setText(x);
        }

        if(txtFromSpinner.equals("City"))
        {
            Encounter_Archive encounter = new Encounter_Archive();
            encounter.cityPopulate();
            String x = encounter.selectCity();
            t.setText(x);
        }

        if(txtFromSpinner.equals("Forest"))
        {
            Encounter_Archive encounter = new Encounter_Archive();
            encounter.forestPopulate();
            String x = encounter.selectForest();
            t.setText(x);
        }

        if(txtFromSpinner.equals("Cave"))
        {
            Encounter_Archive encounter = new Encounter_Archive();
            encounter.cavePopulate();
            String x = encounter.selectCave();
            t.setText(x);
        }

        if(txtFromSpinner.equals("Dungeon"))
        {
            Encounter_Archive encounter = new Encounter_Archive();
            encounter.dungeonPopulate();
            String x = encounter.selectDungeon();
            t.setText(x);
        }

        if(txtFromSpinner.equals("Mountains"))
        {
            Encounter_Archive encounter = new Encounter_Archive();
            encounter.mountainPopulate();
            String x = encounter.selectMountain();
            t.setText(x);
        }

    }

}

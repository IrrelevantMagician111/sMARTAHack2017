package com.smartahack2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class ParkingActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Spinner dropdown;
        dropdown = (Spinner) findViewById(R.id.spinner);
        dropdown.setOnItemSelectedListener(this);
    }
    public void onNothingSelected(AdapterView<?> parent){}
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
        if(pos != 0){Intent myIntent = new Intent(ParkingActivity.this,Parking_lot.class);
        ParkingActivity.this.startActivity(myIntent);}
    }

}

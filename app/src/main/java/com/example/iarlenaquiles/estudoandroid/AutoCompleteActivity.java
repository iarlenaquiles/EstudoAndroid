package com.example.iarlenaquiles.estudoandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        String str[]={"Arun","Mathev","Vishnu","Vishal","Arjun",
                "Arul","Balaji","Babu","Boopathy","Godwin","Nagaraj"};

        AutoCompleteTextView ac = (AutoCompleteTextView) findViewById(R.id.autoComplete);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, str);

        ac.setThreshold(1);
        ac.setAdapter(adp);
    }

}

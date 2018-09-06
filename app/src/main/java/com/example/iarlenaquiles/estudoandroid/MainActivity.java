package com.example.iarlenaquiles.estudoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnToggle;
    private Button btnEditText;
    private Button btnList;
    private Button btnAutoComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonToggle();
        addListenerOnButtonEditText();
        addListenerOnButtonList();
        addListenerOnButtonAutoComplete();

    }

    public void addListenerOnButtonToggle() {
        btnToggle = (Button) findViewById(R.id.btnToggle);

        btnToggle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ToggleActivity.class);
                startActivity(it);
            }
        });
    }

    public void addListenerOnButtonEditText() {
        btnEditText = (Button) findViewById(R.id.btnEditText);

        btnEditText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, EditTextActivity.class);
                startActivity(it);
            }
        });
    }

    public void addListenerOnButtonList() {
        btnList = (Button) findViewById(R.id.btnList);

        btnList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ListActivity.class);
                startActivity(it);
            }
        });

    }

    public void addListenerOnButtonAutoComplete() {
        btnAutoComplete = (Button) findViewById(R.id.btnAutoComplete);

        btnAutoComplete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, AutoCompleteActivity.class);
                startActivity(it);
            }
        });
    }
}

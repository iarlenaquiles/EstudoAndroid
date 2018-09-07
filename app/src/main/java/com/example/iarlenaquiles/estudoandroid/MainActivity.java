package com.example.iarlenaquiles.estudoandroid;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnToggle, btnEditText, btnList, btnAutoComplete, btnSpinner, btnRadio, btnOption, btnLongPress, btnGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonToggle();
        addListenerOnButtonEditText();
        addListenerOnButtonList();
        addListenerOnButtonAutoComplete();
        addListenerOnButtonSpinner();
        addListenerOnButtonRadio();
        addListenerOnButtonOption();
        addListenerOnButtonLongPress();
        addListenerOnButtonGrid();

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.options_menu, menu);
//        return true;
//    }

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

    public void addListenerOnButtonSpinner() {
        btnSpinner = (Button) findViewById(R.id.btnSpinner);

        btnSpinner.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(it);
            }
        });
    }

    public void addListenerOnButtonRadio() {
        btnRadio = (Button) findViewById(R.id.btnRadio);

        btnRadio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, RadioActivity.class);
                startActivity(it);
            }
        });
    }

    public void addListenerOnButtonOption(){
        btnOption = (Button) findViewById(R.id.btnOption);

        btnOption.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, RadioActivity.class);
                startActivity(it);
            }
        });
    }

    public void addListenerOnButtonLongPress(){
        btnLongPress = (Button) findViewById(R.id.btnLongPress);

        btnLongPress.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, LongPressActivity.class);
                startActivity(it);
            }
        });
    }

    public void addListenerOnButtonGrid(){
        btnGrid = (Button) findViewById(R.id.btnGrid);

        btnGrid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, GridActivity.class);
                startActivity(it);
            }
        });
    }

}

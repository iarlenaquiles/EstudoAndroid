package com.example.iarlenaquiles.estudoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonToggle();
    }

    public void addListenerOnButtonToggle() {
        Button btnToggle = (Button) findViewById(R.id.btnToggle);

        btnToggle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ToggleActivity.class);
                startActivity(it);
            }
        });
    }
}

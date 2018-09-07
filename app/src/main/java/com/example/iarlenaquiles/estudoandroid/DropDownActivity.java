package com.example.iarlenaquiles.estudoandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class DropDownActivity extends AppCompatActivity implements MenuItem.OnMenuItemClickListener {

    private Button showMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_down);

//        showMenu = (Button) findViewById(R.id.show_dropdown_menu);
//
//        showMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                PopupMenu dropDownMenu = new PopupMenu(getApplicationContext(), showMenu);
//                dropDownMenu.getMenuInflater().inflate(R.menu.drop_down_menu, dropDownMenu.getMenu());
//                showMenu.setText("Drop Down menu");
//                dropDownMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem item) {
//                        Toast.makeText(getApplicationContext(), "Você clicou " + item.getTitle(), Toast.LENGTH_LONG).show();
//                        return true;
//                    }
//                });
//        dropDownMenu.show();
//            }
//        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }
}

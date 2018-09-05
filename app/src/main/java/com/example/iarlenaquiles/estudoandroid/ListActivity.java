package com.example.iarlenaquiles.estudoandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Curso;
import model.EstadoAtual;

public class ListActivity extends AppCompatActivity {

    ArrayList<Curso> cursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        ListView lista = (ListView) findViewById(R.id.lista);
        cursos = todosCursos();
        ArrayAdapter<Curso> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cursos);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener( new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3)
            {
                Toast.makeText(ListActivity.this, "" + cursos.get( position ).toString(), Toast.LENGTH_SHORT).show();
            }
        } );

    }

    private ArrayList<Curso> todosCursos() {
        return new ArrayList<Curso>(Arrays.asList(
                new Curso("Java", "básico de Java", EstadoAtual.FINALIZADO),
                new Curso("HTML e CSS", "HTML 5 e suas novidades", EstadoAtual.FAZENDO),
                new Curso("Android", "boas práticas", EstadoAtual.FINALIZADO)));
    }



}

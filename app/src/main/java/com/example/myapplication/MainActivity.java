package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity  {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerviewMascota);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar_main);
        setSupportActionBar(myToolbar);

        @SuppressLint("WrongViewCast") ImageView btnHuesoAmarillo = (ImageView) findViewById(R.id.hueso_amarillo);
        @SuppressLint("WrongViewCast") ImageView btnHuesoBlanco = (ImageView) findViewById(R.id.hueso_blanco);


        ArrayList<Mascotas> nameMascota= new ArrayList<>();
        nameMascota.add(new Mascotas("Catty",R.drawable.perro,0));
        nameMascota.add(new Mascotas("Ronny",R.drawable.lobo, 0));

        recyclerView.setHasFixedSize(true);


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        // String[] myDataset = new String[0];
        mAdapter = new MyAdapter(nameMascota);
        recyclerView.setAdapter(mAdapter);


    }

    public void OnClickHuesoAmarillo(View v) {

        Mascotas btn = new Mascotas();
        btn.setFavoriteMascote(btn.getFavoriteMascote() + 1);
        TextView MasLikes=(TextView) findViewById(R.id.likes);

        MasLikes.setText(String.valueOf(btn.getFavoriteMascote()));


    };

    public void OnClickHuesoBlanco(View view) {
        Mascotas btn = new Mascotas();
        btn.setVisibleMascota(false);
    };

}
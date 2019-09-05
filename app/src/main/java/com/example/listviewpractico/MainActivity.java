package com.example.listviewpractico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<Heroe> listaHeores = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargaLista();
        generarListView();
    }

    public void generarListView(){

        ArrayAdapter<Heroe> adapter = new miListaAdapter(this, R.layout.item, listaHeores, getLayoutInflater());

        ListView lv = findViewById(R.id.miLista);

        lv.setAdapter(adapter);


    }

    public void cargaLista() {
        listaHeores.add(new Heroe(R.drawable.ash, "Joaquin Lucero", 2));
        listaHeores.add(new Heroe(R.drawable.bellota, "Mariela Gomez", 1));
        listaHeores.add(new Heroe(R.drawable.cat, "Milena Svenska", 5));
        listaHeores.add(new Heroe(R.drawable.chicomaravilla, "Julio Pergolini", 3));
        listaHeores.add(new Heroe(R.drawable.craig, "Romeo Santos", 4));
        listaHeores.add(new Heroe(R.drawable.finn, "Maximo Caballero", 2));
        listaHeores.add(new Heroe(R.drawable.gumball, "Gustavo Alcaraz", 4));
        listaHeores.add(new Heroe(R.drawable.hippie, "Eros Santana", 1));
        listaHeores.add(new Heroe(R.drawable.panda, "Enzo Miranda", 1));
        listaHeores.add(new Heroe(R.drawable.rikby, "Pedro Lucero", 2));
        listaHeores.add(new Heroe(R.drawable.steven, "Perseo Lucero", 3));
    }
}

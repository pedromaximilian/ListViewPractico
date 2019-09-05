package com.example.listviewpractico;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class miListaAdapter extends ArrayAdapter<Heroe> {

    private Context context;
    private List<Heroe> heroesLista;
    private LayoutInflater li;

    public miListaAdapter(@NonNull Context context, int resource, @NonNull List<Heroe> objects, LayoutInflater li) {
        super(context, resource, objects);

        // me va a ayudar a inflar uel xml de item dentro de cada elemento de la lista


        this.context = context;
        this.heroesLista = objects;
        this.li = li;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView = convertView; //este es el elmento que voy a devolver lo inicializo

        if(itemView==null){
            itemView = li.inflate(R.layout.item,parent,false); //Aca inflo en el itemview el layout
        }

        Heroe heroe = heroesLista.get(position); //creo el heroe segun la posicion de lista que me pasen

        ImageView avatar = itemView.findViewById(R.id.ivAvatar);
        avatar.setImageResource(heroe.getPicture());

        TextView nombre = itemView.findViewById(R.id.tvNombre);
        nombre.setText(heroe.getName());

        RatingBar level = itemView.findViewById(R.id.rbLevel);
        level.setNumStars(heroe.getLevel());
        level.setRating(heroe.getLevel());



        return itemView;
    }
}

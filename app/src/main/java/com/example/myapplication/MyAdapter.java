package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<Mascotas> mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView nameMascota;
        public ImageView imgMascota;
        public MyViewHolder(View v) {
            super(v);
            nameMascota = v.findViewById(R.id.dog_name);
            imgMascota = v.findViewById(R.id.image_central);


        }

        public void bind(Mascotas elements){

            nameMascota.setText(elements.getName());
            imgMascota.setImageResource(elements.getMascota_foto());
        }

    }


    public MyAdapter(ArrayList<Mascotas> myDataset) {
        mDataset = myDataset;
    }


    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mycardview, parent, false));
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int pos) {

        holder.bind(mDataset.get(pos));

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
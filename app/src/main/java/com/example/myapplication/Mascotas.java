package com.example.myapplication;
import android.app.Activity;
import android.view.View;

public class Mascotas extends Activity {
    private String name;
    private int mascota_foto;
    private int favoriteMascote;
    private boolean visibleMascota;


    public Mascotas(String names,int mascot_foo, int favoritMascot) {
        this.name = names;
        this.mascota_foto=mascot_foo;
        this.favoriteMascote=favoritMascot;
    }

    public Mascotas(){

    }



    public String getName() {
        return name;
    }

    public void setName(String names) {
        this.name = names;
    }

    public int getMascota_foto() {
        return mascota_foto;
    }

    public void setMascota_foto(int mascot_foo) {
        this.mascota_foto = mascot_foo;
    }
    public int getFavoriteMascote() {
        return favoriteMascote;
    }

    public void setFavoriteMascote(int favoriteMascot) {
        this.favoriteMascote = favoriteMascot;
    }

    public boolean isVisibleMascota() {
        return visibleMascota;
    }

    public void setVisibleMascota(boolean visibleMascota) {
        this.visibleMascota = visibleMascota;
    }


}

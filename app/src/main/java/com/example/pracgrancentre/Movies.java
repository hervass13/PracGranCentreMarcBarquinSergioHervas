package com.example.pracgrancentre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Movies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        FragmentManager fm = getSupportFragmentManager();
        if(fm.findFragmentById(R.id.contenedorFragment) == null)
        {
            moviesF MoviesF = new moviesF();
            fm.beginTransaction().add(R.id.contenedorFragment, MoviesF).commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        //Mostra el menu.

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        //Quan cliques al menu ve aquí.
        //el intent que crida el Settings Activity

        //Mostrar els settings:
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);

        return true;
    }

}
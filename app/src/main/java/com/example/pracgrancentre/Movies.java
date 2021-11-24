package com.example.pracgrancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

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
}
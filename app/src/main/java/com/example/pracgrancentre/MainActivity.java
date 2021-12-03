package com.example.pracgrancentre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView business;
    ImageView transport;
    ImageView movies;
    ImageView restaurants;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        business = findViewById(R.id.business);

        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), business.class);
                startActivity(in);
            }
        });

        transport = findViewById(R.id.transport);

        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), transport.class);
                startActivity(in);
            }
        });

        movies = findViewById(R.id.movies);

        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMovies = new Intent(getApplicationContext(), Movies.class);
                startActivity(intentMovies);
            }
        });

        restaurants = findViewById(R.id.restaurants);

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRestaurants = new Intent(getApplicationContext(), Restaurants.class);
                startActivity(intentRestaurants);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if(sharedPreferences.contains("colorBackground"))
        {
            String colorBackground = sharedPreferences.getString("colorBackground","");
            getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor(colorBackground)));
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
package com.example.pracgrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
}
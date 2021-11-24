package com.example.pracgrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView Business;
    ImageView Transport;
    ImageView movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Business = findViewById(R.id.business);

        Business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), business.class);
                startActivity(in);
            }
        });

        Transport = findViewById(R.id.transport);

        Transport.setOnClickListener(new View.OnClickListener() {
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
    }
}
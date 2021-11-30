package com.example.pracgrancentre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Restaurants extends AppCompatActivity {

    fragment_restaurant_italia fmItalia;
    fragment_restaurant_marisc fmMarisc;
    fragment_restaurant_vegetaria fmVegetaria;
    Spinner spinner;
    List<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        spinner = findViewById(R.id.spinnerRestaurants);
        fmItalia = new fragment_restaurant_italia();
        fmMarisc = new fragment_restaurant_marisc();
        fmVegetaria = new fragment_restaurant_vegetaria();

        names = new ArrayList<>();
        names.add("Italià");
        names.add("Marisc");
        names.add("Vegetarià");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(Restaurants.this, R.layout.item, names);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        selectFragment(fmItalia);
                        break;
                    case 1:
                        selectFragment(fmMarisc);
                        break;
                    case 2:
                        selectFragment(fmVegetaria);
                        break;
                }
            }

            private void selectFragment(Fragment fragment){
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contenidorFrgmRestaurants,fragment);
                fragmentTransaction.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

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
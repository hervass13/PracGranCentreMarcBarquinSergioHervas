package com.example.pracgrancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class transport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        FragmentManager fm = getSupportFragmentManager();
        if (fm.findFragmentById(R.id.contenidorTransp) == null) {
            transportF TransportF = new transportF();
            fm.beginTransaction().add(R.id.contenidorTransp, TransportF).commit();
        }
    }
}
package com.example.pracgrancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class business extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        FragmentManager fm = getSupportFragmentManager();
        if (fm.findFragmentById(R.id.contenidorBusiness) == null) {
            BusinessF businessF = new BusinessF();
            fm.beginTransaction().add(R.id.contenidorBusiness, businessF).commit();
        }
    }
}
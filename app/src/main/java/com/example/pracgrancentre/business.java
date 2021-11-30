package com.example.pracgrancentre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class business extends AppCompatActivity {

    Spinner spinnerBusiness;
    DiscotequesF fragmentDiscotequesAction;
    PerruqueriesF fragmentPerruqueriesAction;
    BotiguesF fragmentBotiguesAction;
    CopisteriesF fragmentCopisteriesAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        spinnerBusiness = (Spinner) findViewById(R.id.SpinnerBusiness);
        fragmentDiscotequesAction = new DiscotequesF();
        fragmentPerruqueriesAction = new PerruqueriesF();
        fragmentBotiguesAction = new BotiguesF();
        fragmentCopisteriesAction = new CopisteriesF();


        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.Sectors, android.R.layout.simple_spinner_item);
        spinnerBusiness.setAdapter(adapter);

        spinnerBusiness.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){
                    case 0:
                        break;
                    case 1:
                        selectFragment(fragmentBotiguesAction);
                        break;
                    case 2:
                        selectFragment(fragmentPerruqueriesAction);
                        break;
                    case 3:
                        selectFragment(fragmentCopisteriesAction);
                        break;
                    case 4:
                        selectFragment(fragmentDiscotequesAction);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void selectFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.contenidorBusiness,fragment);
        fragmentTransaction.commit();
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
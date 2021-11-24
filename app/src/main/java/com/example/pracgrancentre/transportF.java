package com.example.pracgrancentre;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class transportF extends Fragment {

    private ListView listview;
    private ArrayList<String> names;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //View view = inflater.inflate(R.layout.fragment_transport, container, false);

        /*names = new ArrayList<String>();
        names.add("Veracruz");
        names.add("Tabasco");
        names.add("Chiapas");
        names.add("Campeche");
        names.add("Quintana Roo");
        names.add("Quintana Roo");
        names.add("Quintana Roo");
        names.add("Quintana Roo");
        names.add("Enllaç a la pàgina de Rodalies Centre: http://rodalies.gencat.cat/es/horaris/");
        names.add("http://rodalies.gencat.cat/es/horaris/");
        //listview = (ListView) view.findViewById(R.id.listview);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1, names);
        listview.setAdapter(listViewAdapter);*/
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_transport, container, false);
        //return view;

    }

}
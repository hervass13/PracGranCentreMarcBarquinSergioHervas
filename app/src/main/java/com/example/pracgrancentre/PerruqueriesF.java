package com.example.pracgrancentre;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PerruqueriesF#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerruqueriesF extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PerruqueriesF() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PerruqueriesF.
     */
    // TODO: Rename and change types and number of parameters
    public static PerruqueriesF newInstance(String param1, String param2) {
        PerruqueriesF fragment = new PerruqueriesF();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perruqueries, container, false);

        ImageView ubi = v.findViewById(R.id.ubi);

        ubi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Xavier+Arcarons+Perruquers/@41.6060709,2.2854354,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c7c67f0e6401:0xd07f6880a8d3593a!8m2!3d41.6060912!4d2.2876236"));
                startActivity(intent1);
            }
        });

        ImageView ubi2 = v.findViewById(R.id.ubi2);

        ubi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bellesa+Essencial/@41.6096349,2.2857005,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c7cf4a6d6f39:0x3518ac22197aa6d6!8m2!3d41.6096349!4d2.2878892?hl=es"));
                startActivity(intent1);
            }
        });

        ImageView ubi3 = v.findViewById(R.id.ubi3);

        ubi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/EL+SAL%C3%93+Anna+Serra/@41.6129755,2.2879271,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c7ce8760facf:0x13a3e088bb144609!8m2!3d41.6129755!4d2.2901158"));
                startActivity(intent1);
            }
        });

        ///TELEFONOS//////////////////

        ImageView tlf = v.findViewById(R.id.telefon);

        tlf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938705085"));
                startActivity(intent1);
            }
        });

        ImageView tlf2 = v.findViewById(R.id.telefon2);

        tlf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+34938708807"));
                startActivity(intent1);
            }
        });

        ImageView tlf3 = v.findViewById(R.id.telefon3);

        tlf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:674624651"));
                startActivity(intent1);
            }
        });

        /// MAIL/////////////

        ImageView web = v.findViewById(R.id.web);

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.xavierarcarons.com/"));
                startActivity(intent1);
            }
        });

        ImageView web2 = v.findViewById(R.id.web2);

        web2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bellesaessencial.com/"));
                startActivity(intent1);
            }
        });

        ImageView web3 = v.findViewById(R.id.web3);

        web3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://elsaloperruqueria.com/"));
                startActivity(intent1);
            }
        });

        return v;
    }
}
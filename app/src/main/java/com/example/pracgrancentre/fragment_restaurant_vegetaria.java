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
 * Use the {@link fragment_restaurant_vegetaria#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_restaurant_vegetaria extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_restaurant_vegetaria() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_restaurant_vegetaria.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_restaurant_vegetaria newInstance(String param1, String param2) {
        fragment_restaurant_vegetaria fragment = new fragment_restaurant_vegetaria();
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
        View v = inflater.inflate(R.layout.fragment_restaurant_vegetaria, container, false);

        ImageView telefongatoverde = v.findViewById(R.id.telefonGatoVerde);

        telefongatoverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938403836"));
                startActivity(intent1);
            }
        });

        ImageView ubigatoverde = v.findViewById(R.id.ubiGatoVerde);

        ubigatoverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/41.548454,2.2925922/restaurante+vegetariano+granollers/@41.5803556,2.2357467,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x12a4c62ca6148df3:0x3789eb48dbe16ed8!2m2!1d2.2869426!2d41.6107729"));
                startActivity(intent1);
            }
        });

        ImageView webgatoverde = v.findViewById(R.id.webGatoVerde);

        webgatoverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.apadis.org/el-restaurant.html"));
                startActivity(intent1);
            }
        });

        ImageView telefoncookessa = v.findViewById(R.id.telefonCookessa);

        telefoncookessa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:931352136"));
                startActivity(intent1);
            }
        });

        ImageView ubicookessa = v.findViewById(R.id.ubiCookessa);

        ubicookessa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/41.548454,2.2925922/restaurante+vegetariano+granollers/@41.5803556,2.2357467,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x12a4c79a6208c3b9:0x4e0b3874183aa836!2m2!1d2.2859485!2d41.6104197"));
                startActivity(intent1);
            }
        });

        ImageView webcookessa = v.findViewById(R.id.webCookessa);

        webcookessa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.apadis.org/el-restaurant.html"));
                startActivity(intent1);
            }
        });

        ImageView telefonmint = v.findViewById(R.id.telefonMint);

        telefonmint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:936254198"));
                startActivity(intent1);
            }
        });

        ImageView ubimint = v.findViewById(R.id.ubiMint);

        ubimint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/41.548454,2.2925922/restaurante+vegetariano+granollers/@41.5794199,2.2540336,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x12a4c7c4538d507f:0xeeb9a3ffc88b851d!2m2!1d2.284358!2d41.607668"));
                startActivity(intent1);
            }
        });

        ImageView webmint = v.findViewById(R.id.webMint);

        webmint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mintgranollers.com/"));
                startActivity(intent1);
            }
        });

        return v;
    }
}
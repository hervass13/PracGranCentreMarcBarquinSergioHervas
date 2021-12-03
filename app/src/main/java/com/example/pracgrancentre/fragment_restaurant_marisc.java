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
 * Use the {@link fragment_restaurant_marisc#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_restaurant_marisc extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_restaurant_marisc() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_restaurant_marisc.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_restaurant_marisc newInstance(String param1, String param2) {
        fragment_restaurant_marisc fragment = new fragment_restaurant_marisc();
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
        View v = inflater.inflate(R.layout.fragment_restaurant_marisc, container, false);

        ImageView telefonosgalegos = v.findViewById(R.id.telefonOsGalegos);

        telefonosgalegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938403039"));
                startActivity(intent1);
            }
        });

        ImageView ubiosgalegos = v.findViewById(R.id.ubiOsGalegos);

        ubiosgalegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/41.548454,2.2925922/restaurante+os+galegos+granollers/@41.5827188,2.2450837,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x12a4c7ccdfe5a935:0xc2487fd72fe0474e!2m2!1d2.2925691!2d41.6175591?hl=es"));
                startActivity(intent1);
            }
        });

        ImageView webosgalegos = v.findViewById(R.id.ubiOsGalegos);

        webosgalegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.osgalegos.com/"));
                startActivity(intent1);
            }
        });

        ImageView telefoncisne = v.findViewById(R.id.telefonCisne);

        telefoncisne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938706038"));
                startActivity(intent1);
            }
        });

        ImageView ubicisne = v.findViewById(R.id.ubiCisne);

        ubicisne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/41.548454,2.2925922/restaurante+el+cisne+granollers/@41.5773472,2.2571143,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x12a4c7c5cc3bde55:0x3174164d128369b8!2m2!1d2.2886911!2d41.606082?hl=es"));
                startActivity(intent1);
            }
        });

        ImageView webcisne = v.findViewById(R.id.webCisne);

        webcisne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/elcisnerestaurantgranollers/"));
                startActivity(intent1);
            }
        });

        ImageView telefongranolla = v.findViewById(R.id.telefonGranOlla);

        telefongranolla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938795100"));
                startActivity(intent1);
            }
        });

        ImageView ubigranolla = v.findViewById(R.id.ubiGranOlla);

        ubigranolla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/41.548454,2.2925922/restaurante+la+gran+olla+granollers/@41.5713262,2.2517145,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x12a4c7eb849477ed:0xc659d9c1bd32fddf!2m2!1d2.2856451!2d41.5941661?hl=es"));
                startActivity(intent1);
            }
        });

        ImageView webgranolla = v.findViewById(R.id.webGranOlla);

        webgranolla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.restaurantlagranolla.com/"));
                startActivity(intent1);
            }
        });

        return v;
    }
}
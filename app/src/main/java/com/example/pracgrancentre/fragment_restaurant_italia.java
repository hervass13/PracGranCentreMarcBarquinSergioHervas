package com.example.pracgrancentre;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_restaurant_italia#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_restaurant_italia extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_restaurant_italia() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_restaurant_italia.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_restaurant_italia newInstance(String param1, String param2) {
        fragment_restaurant_italia fragment = new fragment_restaurant_italia();
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
        View v = inflater.inflate(R.layout.fragment_restaurant_italia, container, false);

        ImageView ubiItaliano = v.findViewById(R.id.ubiItaliano);

        ubiItaliano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/El+ITALIANO/@41.605787,2.2858134,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c7c4a601fcf5:0x9fafe095a0a459a4!8m2!3d41.605787!4d2.2880021"));
                startActivity(intent1);
            }
        });

        ImageView telfItaliano = v.findViewById(R.id.telefonElItaliano);

        telfItaliano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:931296346"));
                startActivity(intent1);
            }
        });

        ImageView webItaliano = v.findViewById(R.id.webItalianp);

        webItaliano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://elitaliano.es/"));
                startActivity(intent1);
            }
        });

        ImageView ubiTagliatella = v.findViewById(R.id.ubiTagliatella);

        ubiTagliatella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/maps/place/Restaurante+La+Tagliatella+%7C+Granollers/@41.6109161,2.2875852,17z/data=!3m2!4b1!5s0x12a4c7cefd8cdea9:0x8c0651c6391f649c!4m5!3m4!1s0x12a4c7cefd9ab97f:0x8e0116b2b3c548e9!8m2!3d41.6109161!4d2.2897739?hl=es"));
                startActivity(intent1);
            }
        });

        ImageView telfTagliatella = v.findViewById(R.id.telefonTagliatella);

        telfTagliatella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938604899"));
                startActivity(intent1);
            }
        });

        ImageView webTagliatella = v.findViewById(R.id.webTagliatella);

        webTagliatella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.latagliatella.es/restaurantes/barcelona/granollers"));
                startActivity(intent1);
            }
        });

        ImageView ubiSpore = v.findViewById(R.id.ubiSpore);

        ubiSpore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/maps/place/Il+Sapore+Italiano/@41.6116014,2.28421,17z/data=!3m2!4b1!5s0x12a4c7c917effe3f:0xd07bdf069053ea9b!4m5!3m4!1s0x12a4c7c922ad7c13:0x4978bc8109f0e496!8m2!3d41.6116014!4d2.2863987?hl=es"));
                startActivity(intent1);
            }
        });

        ImageView telfSpore = v.findViewById(R.id.telefonSpore);

        telfSpore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938401532"));
                startActivity(intent1);
            }
        });

        ImageView webSpore = v.findViewById(R.id.webSpore);

        webSpore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ilsaporeitalianogranollers.es/"));
                startActivity(inten1);
            }
        });

        return v;
    }
}
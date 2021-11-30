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
 * Use the {@link BotiguesF#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BotiguesF extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BotiguesF() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BotiguesF.
     */
    // TODO: Rename and change types and number of parameters
    public static BotiguesF newInstance(String param1, String param2) {
        BotiguesF fragment = new BotiguesF();
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
        View v = inflater.inflate(R.layout.fragment_botigues, container, false);

        ImageView ubi = v.findViewById(R.id.ubi);

        ubi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/AGUDO+LINIA/@41.6077679,2.286484,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c7c5ed67828b:0x8482f906ecb8bc2f!8m2!3d41.6077679!4d2.2886727"));
                startActivity(intent1);
            }
        });

        ImageView ubi2 = v.findViewById(R.id.ubi2);

        ubi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Barbany+Granollers/@41.606755,2.2863073,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c7c5c43e1f8b:0xe93179e0ee78aea7!8m2!3d41.606755!4d2.288496?hl=es"));
                startActivity(intent1);
            }
        });

        ImageView ubi3 = v.findViewById(R.id.ubi3);

        ubi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Montse+Interiors,+Carrer+d'Alfons+IV,+74,+08401+Granollers,+Barcelona/@41.603744,2.0076786,10z/data=!3m1!5s0x12a4c7c4022a9607:0xe21d4c8de94d5eee!4m17!1m7!3m6!1s0x12a4c7c403f678eb:0xfe45f76242a82c66!2sMontse+Interiors!8m2!3d41.603744!4d2.28783!15sChBtb250c2UgaW50ZXJpb3JzIgOIAQFaEiIQbW9udHNlIGludGVyaW9yc5IBEGhvbWVfZ29vZHNfc3RvcmU!4m8!1m0!1m5!1m1!1s0x12a4c7c403f678eb:0xfe45f76242a82c66!2m2!1d2.28783!2d41.603744!3e3?hl=es"));
                startActivity(intent1);
            }
        });

        ///TELEFONOS//////////////////

        ImageView tlf = v.findViewById(R.id.telefon);

        tlf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938708977"));
                startActivity(intent1);
            }
        });

        ImageView tlf2 = v.findViewById(R.id.telefon2);

        tlf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938792816"));
                startActivity(intent1);
            }
        });

        ImageView tlf3 = v.findViewById(R.id.telefon3);

        tlf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938330160"));
                startActivity(intent1);
            }
        });

        /// MAIL/////////////

        ImageView web = v.findViewById(R.id.web);

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://agudostores.com/es/"));
                startActivity(intent1);
            }
        });

        ImageView web2 = v.findViewById(R.id.web2);

        web2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.barbanygranollers.com/"));
                startActivity(intent1);
            }
        });

        ImageView web3 = v.findViewById(R.id.web3);

        web3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.montseinteriors.com/"));
                startActivity(intent1);
            }
        });


        return v;
    }
}
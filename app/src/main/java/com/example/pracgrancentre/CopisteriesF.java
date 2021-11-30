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
 * Use the {@link CopisteriesF#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CopisteriesF extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CopisteriesF() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CopisteriesF.
     */
    // TODO: Rename and change types and number of parameters
    public static CopisteriesF newInstance(String param1, String param2) {
        CopisteriesF fragment = new CopisteriesF();
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
        View v = inflater.inflate(R.layout.fragment_copisteries, container, false);

        ImageView ubi = v.findViewById(R.id.ubi);

        ubi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/COPISTERIA+A4/@41.5523533,2.1460053,11z/data=!3m1!5s0x12a4c7cf4b624c5b:0x175641ea7fdef267!4m9!1m2!2m1!1scopisteria+a4!3m5!1s0x12a4c7cf4c46c7f5:0xdd7e89011cfc6946!8m2!3d41.6093373!4d2.287877!15sCg1jb3Bpc3RlcmlhIGE0Wg8iDWNvcGlzdGVyaWEgYTSSAQljb3B5X3Nob3CaASNDaFpEU1VoTk1HOW5TMFZKUTBGblNVTTBhMkUzV21SbkVBRQ"));
                startActivity(intent1);
            }
        });

        ImageView ubi2 = v.findViewById(R.id.ubi2);

        ubi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/PLANOLS+copisteria+t%C3%A8cnica/@41.59725,2.2874243,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c7e9c85da33f:0x217ef1b45dd5548f!8m2!3d41.59725!4d2.289613?hl=es"));
                startActivity(intent1);
            }
        });

        ImageView ubi3 = v.findViewById(R.id.ubi3);

        ubi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Molins+de+Paper/@41.6129349,2.2881282,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c7ce7da9a841:0x24e3de20dc47f3e2!8m2!3d41.6129349!4d2.2903169?hl=es"));
                startActivity(intent1);
            }
        });

        ///TELEFONOS//////////////////

        ImageView tlf = v.findViewById(R.id.telefon);

        tlf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938700026"));
                startActivity(intent1);
            }
        });

        ImageView tlf2 = v.findViewById(R.id.telefon2);

        tlf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938701704"));
                startActivity(intent1);
            }
        });

        ImageView tlf3 = v.findViewById(R.id.telefon3);

        tlf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938467590"));
                startActivity(intent1);
            }
        });

        /// MAIL/////////////

        ImageView web = v.findViewById(R.id.web);

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.a4copisteria.com/"));
                startActivity(intent1);
            }
        });

        ImageView web2 = v.findViewById(R.id.web2);

        web2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.planols.com/"));
                startActivity(intent1);
            }
        });

        ImageView web3 = v.findViewById(R.id.web3);

        web3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://molinsdepaper.amilibro.com/"));
                startActivity(intent1);
            }
        });

        return v;
    }
}
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
 * Use the {@link DiscotequesF#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DiscotequesF extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DiscotequesF() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BusinessF.
     */
    // TODO: Rename and change types and number of parameters
    public static DiscotequesF newInstance(String param1, String param2) {
        DiscotequesF fragment = new DiscotequesF();
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
        View v  = inflater.inflate(R.layout.fragment_discoteques, container, false);


        ImageView ubi = v.findViewById(R.id.ubi);

        ubi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/maps/place/Carrer+Sabadell,+2046,+08403+Granollers,+Barcelona/@41.602958,2.278551,14z/data=!4m5!3m4!1s0x12a4c7beaf62f6a3:0xfa4b053e91aa8e17!8m2!3d41.6030526!4d2.2782321"));
                startActivity(intent1);
            }
        });

        ImageView ubi2 = v.findViewById(R.id.ubi2);

        ubi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Discoteca+Bora+Bora/@41.552141,2.1111144,12z/data=!4m9!1m2!2m1!1sbora+granollers!3m5!1s0x12a4945117795231:0x634a71c4b718cc0c!8m2!3d41.5358485!4d2.0988055!15sCg9ib3JhIGdyYW5vbGxlcnNaESIPYm9yYSBncmFub2xsZXJzkgEKbmlnaHRfY2x1Yg"));
                startActivity(intent1);
            }
        });

        ImageView ubi3 = v.findViewById(R.id.ubi3);

        ubi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Navu+Granollers/@41.6095211,2.3010403,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c95c00380615:0xe3d38f405b677ce2!8m2!3d41.6095211!4d2.303229?hl=es"));
                startActivity(intent1);
            }
        });

        ///TELEFONOS//////////////////


        ImageView tlf2 = v.findViewById(R.id.telefon2);

        tlf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:619727144"));
                startActivity(intent1);
            }
        });

        ImageView tlf3 = v.findViewById(R.id.telefon3);

        tlf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:626751158"));
                startActivity(intent1);
            }
        });

        /// MAIL/////////////

        ImageView web = v.findViewById(R.id.web);

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.2046granollers.com"));
                startActivity(intent1);
            }
        });

        ImageView web2 = v.findViewById(R.id.web2);

        web2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.carpasborabora.com"));
                startActivity(intent1);
            }
        });

        ImageView web3 = v.findViewById(R.id.web3);

        web3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.navugranollers.com/es/#/events"));
                startActivity(intent1);
            }
        });

        return v;
    }
}
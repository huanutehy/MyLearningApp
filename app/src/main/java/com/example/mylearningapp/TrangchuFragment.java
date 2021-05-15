package com.example.mylearningapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class TrangchuFragment extends Fragment {
ImageView img_hocphan;
ImageView img_khaosat;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_trangchu, container, false);
        img_hocphan= view.findViewById(R.id.hocphan);
        img_khaosat = view.findViewById(R.id.img_khaosat);
        img_khaosat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(), Khaosat.class);
                startActivity(intent);
            }
        });
        img_hocphan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HocPhan.class);
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return view;

    }

}
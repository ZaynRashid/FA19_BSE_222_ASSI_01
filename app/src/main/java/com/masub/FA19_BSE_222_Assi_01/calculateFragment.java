package com.masub.FA19_BSE_222_Assi_01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link calculateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class calculateFragment extends Fragment {


    public calculateFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static calculateFragment newInstance() {
        calculateFragment fragment = new calculateFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculate, container, false);
    }
}
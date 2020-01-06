package com.sudarsanudash.hamrobazarreplica.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sudarsanudash.hamrobazarreplica.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSecond extends Fragment {


    public FragmentSecond() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_second, container, false);
    }

}

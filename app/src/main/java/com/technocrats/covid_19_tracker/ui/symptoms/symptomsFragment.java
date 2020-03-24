package com.technocrats.covid_19_tracker.ui.symptoms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.technocrats.covid_19_tracker.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class symptomsFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_symptoms, container, false);

        return root;
    }
}

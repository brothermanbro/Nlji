package com.example.nlji;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class challengeAddActivity extends Fragment {
Button Workout;
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.challenge_add, container, false);

        Workout = rootView.findViewById(R.id.workout);

        Workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              naviActivity main  = (naviActivity) getActivity();

            }
        });
        return rootView;
    }



}


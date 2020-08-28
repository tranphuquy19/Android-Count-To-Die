package com.e.counterhelloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    private static TextView txtCounter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        initComponent(view);
        return view;
    }

    private void initComponent(View view) {
        txtCounter = view.findViewById(R.id.txtCounter);
        Log.d("'Test'", txtCounter.toString());
    }

    public static void setTxtCounter(int counterValue) {
        try {
            txtCounter.setText(String.valueOf(counterValue));
        } catch (Exception e) {
            txtCounter.setText("0");
        }
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
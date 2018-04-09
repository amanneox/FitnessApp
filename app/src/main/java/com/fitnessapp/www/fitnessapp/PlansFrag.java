package com.fitnessapp.www.fitnessapp;

import android.app.ActionBar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import me.tankery.lib.circularseekbar.CircularSeekBar;

import static android.content.ContentValues.TAG;

/**
 * Created by Aman on 2/17/2018.
 */

public class PlansFrag extends Fragment {
    CircularSeekBar p1,p2,p3,p4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView= inflater.inflate(R.layout.activity_plans, container, false);

        p1=rootView.findViewById(R.id.progressBar);
        p2=rootView.findViewById(R.id.progressBar2);
        p3=rootView.findViewById(R.id.progressBar3);
        p4=rootView.findViewById(R.id.progressBar4);

        ActionBar actionBar=getActivity().getActionBar();


        //ProgressBar Settings
        p1.setCircleStrokeWidth(34);
        p1.setMax(100);
        p1.setNegativeEnabled(false);
        p1.setCircleProgressColor(getResources().getColor(R.color.colorPrimary));
        p1.setCircleColor(getResources().getColor(R.color.colorLightGrey2));
        p1.setPointerColor(getResources().getColor(R.color.colorPrimary));

        p2.setCircleStrokeWidth(34);
        p2.setMax(100);
        p2.setNegativeEnabled(false);
        p2.setCircleProgressColor(getResources().getColor(R.color.colorBlue));
        p2.setCircleColor(getResources().getColor(R.color.colorLightGrey2));
        p2.setPointerColor(getResources().getColor(R.color.colorBlue));

        p3.setCircleStrokeWidth(34);
        p3.setMax(100);
        p3.setNegativeEnabled(false);
        p3.setCircleProgressColor(getResources().getColor(R.color.colorCyan));
        p3.setCircleColor(getResources().getColor(R.color.colorLightGrey2));
        p3.setPointerColor(getResources().getColor(R.color.colorCyan));

        p4.setCircleStrokeWidth(34);
        p4.setMax(100);
        p3.setNegativeEnabled(false);
        p4.setCircleProgressColor(getResources().getColor(R.color.colorAccent));
        p4.setCircleColor(getResources().getColor(R.color.colorLightGrey2));
        p4.setPointerColor(getResources().getColor(R.color.colorAccent));


        return rootView;
    }


}

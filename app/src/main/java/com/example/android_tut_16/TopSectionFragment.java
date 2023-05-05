package com.example.android_tut_16;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//since we are using fragments so we need to inherit it from fragment
public class TopSectionFragment extends Fragment {

    private static EditText toptextinput;
    private static EditText bottomtextinput;

    //Creating interface
    TopSectionListner activityCommander;


    //this method will help to communicate with MainActivity
    public interface TopSectionListner{
        public void creatememe(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            activityCommander = (TopSectionListner) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //It tells what layout we are using
        //container is viewgroup
        View view = inflater.inflate(R.layout.top_section, container, false);


        toptextinput = (EditText) view.findViewById(R.id.topinput);
        bottomtextinput = (EditText) view.findViewById(R.id.bottominput);
        final Button button = (Button) view.findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating new method
                buttonClicked(v);
            }
        });

        return view;
    }


    //called when button is clicked
    public void buttonClicked(View view){

        activityCommander.creatememe(toptextinput.getText().toString(), bottomtextinput.getText().toString());

    }

}

package com.example.android_tut_16;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BottomPictureFragment extends Fragment {

    private static TextView topmemetext, bottommemetext;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);

        topmemetext = (TextView) view.findViewById(R.id.tv1);
        bottommemetext = (TextView) view.findViewById(R.id.tv2);

        return view;
    }

    public void setMemeText(String top, String bottom){
        topmemetext.setText(top);
        bottommemetext.setText(bottom);
    }

}

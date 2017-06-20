package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// DONE (2) Create a new class called BodyPartFragment to display an image of an Android-Me body
// body part.
//
// In this class, you'll need to implement an empty constructor and the onCreateView method
public class BodyPartFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the root view.
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        // DONE (3) Show the first image in the list of head images
        // Soon, you'll update this image display code to show any image you want
        ImageView bodyPartView = (ImageView) rootView.findViewById(R.id.img_body_part);
        bodyPartView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootView;
    }
}

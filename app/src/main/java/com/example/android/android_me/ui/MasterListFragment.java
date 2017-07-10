package com.example.android.android_me.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;
import java.util.Map;

public class MasterListFragment extends Fragment {
    // DONE (2) Create a new class called MasterListFragment which will display the GridView list of ALL AndroidMe images
    // In the fragment class, you'll need to implement an empty constructor, and onCreateView

    // DONE (3) In the MasterListFragment class, create a new MasterListAdapter and set it on the GridView
    // The MasterListAdapter code is provided; it creates the ImageViews that are contained in the GridView
    // The adapter takes as parameters (Context context, List<Integer> imageIds)

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        GridView allPartsGridView = (GridView) rootView.findViewById(R.id.grid_all_parts);
        MasterListAdapter masterListAdapter = new MasterListAdapter(getActivity(), AndroidImageAssets.getAll());
        allPartsGridView.setAdapter(masterListAdapter);

        return rootView;
    }
}

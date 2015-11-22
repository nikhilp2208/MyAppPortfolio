package com.example.android.myappportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mArrayAdapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView =  inflater.inflate(R.layout.fragment_main, container, false);
        String[] my_apps = {getString(R.string.spotify_streamer),getString(R.string.super_duo),getString(R.string.build_it_bigger),getString(R.string.xyz_reader),getString(R.string.capstone)};
        List<String> my_apps_list = new ArrayList<String>(Arrays.asList(my_apps));
        mArrayAdapter = new ArrayAdapter<String>(getActivity(),R.layout.button_list_view,R.id.my_apps_button,my_apps_list);
        ListView listView = (ListView) rootView.findViewById(R.id.my_apps_listview);
        listView.setAdapter(mArrayAdapter);
        return rootView;
    }
}
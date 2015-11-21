package com.example.android.myappportfolio;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mArrayAdapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView =  inflater.inflate(R.layout.fragment_main, container, false);
        String[] my_apps = {"Spotify Streamer","Super Duo","Build It Bigger","XYZ Reader","Capstone"};
        List<String> my_apps_list = new ArrayList<String>(Arrays.asList(my_apps));
        mArrayAdapter = new ArrayAdapter<String>(getActivity(),R.layout.button_list_view,R.id.my_apps_button,my_apps_list);
        ListView listView = (ListView) rootView.findViewById(R.id.my_apps_listview);
        listView.setAdapter(mArrayAdapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                String text = mArrayAdapter.getItem(position);
//                Toast.makeText(getActivity(), text, Toast.LENGTH_LONG).show();
//            }
//        });

//        Button button = (Button) rootView.findViewById(R.id.my_apps_button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Button appButton = (Button) view;
//                String text = appButton.getText().toString();
//                Toast.makeText(getActivity(),text,Toast.LENGTH_LONG).show();
//            }
//        });
        return rootView;
    }
}
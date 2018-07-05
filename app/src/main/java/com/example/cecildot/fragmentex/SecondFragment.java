package com.example.cecildot.fragmentex;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        String data = getArguments().getString("data");
        TextView tv = (TextView)view.findViewById(R.id.txtf2);
        tv.setText("Transferred Data:   "+data);

        return view;
    }


}

package com.eurosoft.mega.site.tr.fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.eurosoft.mega.site.tr.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OpeningFragment extends Fragment {

    private static final String URL = "http://megatelekom.com/";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_opening, container, false);

        ImageView ivOpening = rootView.findViewById(R.id.ivOpening);
        ivOpening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse(URL));
                if (browserIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    Toast.makeText(getActivity(), getActivity().getString(R.string.website_is_opening), Toast.LENGTH_SHORT).show();
                    getActivity().startActivity(browserIntent);
                } else {
                    Toast.makeText(getActivity(), getActivity().getString(R.string.url_not_found_error), Toast.LENGTH_SHORT).show();
                }
            }
        });

        return rootView;
    }
}
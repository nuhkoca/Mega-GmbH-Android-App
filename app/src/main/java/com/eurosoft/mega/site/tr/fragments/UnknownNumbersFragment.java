package com.eurosoft.mega.site.tr.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eurosoft.mega.site.tr.R;
import com.eurosoft.mega.site.tr.utils.FontEquipper;
import com.eurosoft.mega.site.tr.utils.ReadFromAssets;


/**
 * A simple {@link Fragment} subclass.
 */
public class UnknownNumbersFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_unknown_numbers, container, false);

        TextView tvUN1 = rootView.findViewById(R.id.tvUN1);
        TextView tvUN2 = rootView.findViewById(R.id.tvUN2);

        tvUN1.setTypeface(FontEquipper.equip(FontEquipper.ROBOTO_REGULAR, getActivity()));
        tvUN2.setTypeface(FontEquipper.equip(FontEquipper.ROBOTO_REGULAR, getActivity()));

        ReadFromAssets readFromAssets = new ReadFromAssets();

        tvUN1.setText(readFromAssets.readFile(getActivity(), "texts/bilnum.txt"));
        tvUN2.setText(readFromAssets.readFile(getActivity(), "texts/bilnum2.txt"));

        return rootView;
    }
}

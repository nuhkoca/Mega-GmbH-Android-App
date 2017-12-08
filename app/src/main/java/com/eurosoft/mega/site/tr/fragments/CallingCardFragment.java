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
public class CallingCardFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_calling_card, container, false);

        TextView tvCC1 = rootView.findViewById(R.id.tvCC1);
        TextView tvCC2 = rootView.findViewById(R.id.tvCC2);
        tvCC1.setTypeface(FontEquipper.equip(FontEquipper.ROBOTO_REGULAR, getActivity()));
        tvCC2.setTypeface(FontEquipper.equip(FontEquipper.ROBOTO_REGULAR, getActivity()));

        ReadFromAssets readFromAssets = new ReadFromAssets();

        tvCC1.setText(readFromAssets.readFile(getActivity(), "texts/aramakarti.txt"));
        tvCC2.setText(readFromAssets.readFile(getActivity(), "texts/aramakarti2.txt"));

        return rootView;
    }
}

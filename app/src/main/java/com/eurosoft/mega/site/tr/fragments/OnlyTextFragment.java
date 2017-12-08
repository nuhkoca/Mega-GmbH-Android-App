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
public class OnlyTextFragment extends Fragment {

    protected String res;

    public static OnlyTextFragment newInstance(String sectionId) {
        OnlyTextFragment onlyTextFragment = new OnlyTextFragment();
        Bundle bundle = new Bundle();
        bundle.putString("fragmentName", sectionId);
        onlyTextFragment.setArguments(bundle);
        return onlyTextFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        res = getArguments().getString("fragmentName");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_only_text, container, false);

        ReadFromAssets readFromAssets = new ReadFromAssets();
        TextView tvOnlyText = rootView.findViewById(R.id.tvOnlyText);
        tvOnlyText.setTypeface(FontEquipper.equip(FontEquipper.ROBOTO_REGULAR, getActivity()));

        tvOnlyText.setText("");

        if (res.equals("STH")) {
            tvOnlyText.setText(readFromAssets.readFile(getActivity(), "texts/sth.txt"));
        }
        if (res.equals("CAR")) {
            tvOnlyText.setText(readFromAssets.readFile(getActivity(), "texts/carrier.txt"));
        }
        if (res.equals("CAC")){
            tvOnlyText.setText(readFromAssets.readFile(getActivity(), "texts/callcenter.txt"));
        }
        if (res.equals("TEM")){
            tvOnlyText.setText(readFromAssets.readFile(getActivity(), "texts/tellmy.txt"));
        }
        if (res.equals("INF")){
            tvOnlyText.setText(readFromAssets.readFile(getActivity(), "texts/profile.txt"));
        }
        if (res.equals("NET")){
            tvOnlyText.setText(readFromAssets.readFile(getActivity(), "texts/network.txt"));
        }

        return rootView;
    }
}
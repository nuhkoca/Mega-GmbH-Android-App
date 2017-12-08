package com.eurosoft.mega.site.tr.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.eurosoft.mega.site.tr.R;
import com.eurosoft.mega.site.tr.models.Countries;
import com.eurosoft.mega.site.tr.utils.FontEquipper;
import com.eurosoft.mega.site.tr.utils.ReadFromAssets;

import java.util.List;

/**
 * Created by ytu-nuh-koca on 20/08/2017.
 */

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.MyViewHolder> {

    private List<Countries> countries;

    public CountriesAdapter(List<Countries> countries) {
        this.countries = countries;
    }

    @Override
    public CountriesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_items, parent, false);

        return new CountriesAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CountriesAdapter.MyViewHolder holder, int position) {
        final Countries countries1 = countries.get(position);

        ReadFromAssets readFromAssets = new ReadFromAssets();

        holder.ivCountry.setImageResource(countries1.getFlagID());
        holder.tvCountry.setText(readFromAssets.readFile(holder.tvCountry.getContext(), countries1.getContent()));

    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivCountry;
        private TextView tvCountry;

        MyViewHolder(View itemView) {
            super(itemView);

            ivCountry = itemView.findViewById(R.id.ivCountry);
            tvCountry = itemView.findViewById(R.id.tvCountry);

            tvCountry.setTypeface(FontEquipper.equip(FontEquipper.ROBOTO_LIGHT, itemView.getContext()));
        }
    }
}

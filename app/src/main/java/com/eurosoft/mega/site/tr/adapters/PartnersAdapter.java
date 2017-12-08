package com.eurosoft.mega.site.tr.adapters;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.eurosoft.mega.site.tr.R;
import com.eurosoft.mega.site.tr.models.Partners;

import java.util.List;

/**
 * Created by ytu-nuh-koca on 19/08/2017.
 */

public class PartnersAdapter extends RecyclerView.Adapter<PartnersAdapter.MyViewHolder> {

    private List<Partners> partnerses;

    public PartnersAdapter(List<Partners> partnerses) {
        this.partnerses = partnerses;
    }

    @Override
    public PartnersAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.iaw_items, parent, false);

        return new PartnersAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PartnersAdapter.MyViewHolder holder, int position) {
        final Partners partners = partnerses.get(position);

        holder.ivSS.setImageResource(partners.getPhotoID());

        holder.ivSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse(partners.getUrl()));
                if (browserIntent.resolveActivity(view.getContext().getPackageManager()) != null && partners.getUrl() != null) {
                    Toast.makeText(view.getContext(), view.getContext().getString(R.string.website_is_opening), Toast.LENGTH_SHORT).show();
                    view.getContext().startActivity(browserIntent);
                }else {
                    Toast.makeText(view.getContext(), view.getContext().getString(R.string.url_not_found_error), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return partnerses.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivSS;

        MyViewHolder(View itemView) {
            super(itemView);

            ivSS = itemView.findViewById(R.id.ivSS);
        }
    }
}

package com.eurosoft.mega.site.tr.activities;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.eurosoft.mega.site.tr.R;
import com.eurosoft.mega.site.tr.utils.FontEquipper;

public class InfoActivity extends AppCompatActivity {

    private Context context = this;
    private static final String VERSION = "v ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView tvInfo = (TextView) findViewById(R.id.tvInfo);
        tvInfo.setTypeface(FontEquipper.equip(FontEquipper.ROBOTO_MEDIUM, context));

        TextView tvARS = (TextView) findViewById(R.id.tvARS);
        tvARS.setTypeface(FontEquipper.equip(FontEquipper.ROBOTO_LIGHT, context));

        TextView tvCredit = (TextView) findViewById(R.id.tvCredit);
        tvCredit.setTypeface(FontEquipper.equip(FontEquipper.ROBOTO_LIGHT, context));

        PackageInfo pinfo;
        try {
            pinfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            String versionName = pinfo.versionName;
            tvInfo.setText((VERSION + versionName));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}

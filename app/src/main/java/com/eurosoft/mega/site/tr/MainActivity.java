package com.eurosoft.mega.site.tr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.eurosoft.mega.site.tr.fragments.CallingCardFragment;
import com.eurosoft.mega.site.tr.fragments.ImageAndWebFragment;
import com.eurosoft.mega.site.tr.fragments.OnlyTextFragment;
import com.eurosoft.mega.site.tr.fragments.OpeningFragment;
import com.eurosoft.mega.site.tr.fragments.UnknownNumbersFragment;
import com.eurosoft.mega.site.tr.utils.FontEquipper;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Context context = this;
    private boolean doubleBackToExitPressedOnce = false;
    private FragmentManager fragmentManager;
    private TextView tvAppName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
        navigationView.setItemTextColor(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.colorBlack)));

        fragmentManager = getSupportFragmentManager();
        replaceFragment(new OpeningFragment());

        tvAppName = (TextView) findViewById(R.id.tvAppName);
        tvAppName.setTypeface(FontEquipper.equip(FontEquipper.ROBOTO_REGULAR, context));

        /**FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent infoIntent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(infoIntent);
            }
        }); **/
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (doubleBackToExitPressedOnce) {
                super.onBackPressed();

                finishAffinity();
            }

            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, R.string.exit_the_app, Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 2000);
        }

        replaceFragment(new OpeningFragment());
        tvAppName.setText(getString(R.string.app_name));
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.option1) {
            replaceOnlyTextFragment("STH");
            tvAppName.setText(getString(R.string.option_1));
        }
        if (id == R.id.option2) {
            replaceOnlyTextFragment("CAR");
            tvAppName.setText(getString(R.string.option_2));
        }
        if (id == R.id.option3){
            replaceFragment(new CallingCardFragment());
            tvAppName.setText(getString(R.string.option_3));
        }
        if (id == R.id.option4){
            replaceFragment(new UnknownNumbersFragment());
            tvAppName.setText(getString(R.string.option_4));
        }
        if (id == R.id.option5){
            replaceOnlyTextFragment("CAC");
            tvAppName.setText(getString(R.string.option_5));
        }
        if (id == R.id.option6){
            replaceOnlyTextFragment("TEM");
            tvAppName.setText(getString(R.string.option_6));
        }
        if (id == R.id.option7){
            replaceImageAndWebFragment("EXS");
            tvAppName.setText(getString(R.string.option_7));
        }
        if (id == R.id.option8){
            replaceImageAndWebFragment("INS");
            tvAppName.setText(getString(R.string.option_8));
        }
        if (id == R.id.option9){
            replaceImageAndWebFragment("PAR");
            tvAppName.setText(getString(R.string.option_9));
        }
        if (id == R.id.option10){
            replaceImageAndWebFragment("REF");
            tvAppName.setText(getString(R.string.option_10));
        }
        if (id == R.id.option11){
            replaceOnlyTextFragment("INF");
            tvAppName.setText(getString(R.string.option_11));
        }
        if (id == R.id.option12){
            replaceOnlyTextFragment("NET");
            tvAppName.setText(getString(R.string.option_12));
        }
        if (id == R.id.option13) {
            replaceImageAndWebFragment("CON");
            tvAppName.setText(getString(R.string.option_13));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private Fragment replaceOnlyTextFragment(String section) {
        OnlyTextFragment onlyTextFragment = OnlyTextFragment.newInstance(section);

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.slide_in_up, R.anim.slide_in_down, R.anim.slide_out_down, R.anim.slide_out_up);
        fragmentTransaction.replace(R.id.mainFrame, onlyTextFragment);
        fragmentTransaction.commit();

        return onlyTextFragment;
    }

    private Fragment replaceImageAndWebFragment(String section) {
        ImageAndWebFragment imageAndWebFragment = ImageAndWebFragment.newInstance(section);

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.slide_in_up, R.anim.slide_in_down, R.anim.slide_out_down, R.anim.slide_out_up);
        fragmentTransaction.replace(R.id.mainFrame, imageAndWebFragment);
        fragmentTransaction.commit();

        return imageAndWebFragment;
    }

    private Fragment replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.slide_in_up, R.anim.slide_in_down, R.anim.slide_out_down, R.anim.slide_out_up);
        fragmentTransaction.replace(R.id.mainFrame, fragment);
        fragmentTransaction.commit();

        return fragment;
    }
}

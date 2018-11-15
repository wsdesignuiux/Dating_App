package com.example.wolfsoft3.dating_app;

import android.content.res.Configuration;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map_and_Navigation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, OnMapReadyCallback, View.OnClickListener {


    //navigation

    private ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    private DrawerLayout drawer;
    private Toolbar toolbar;

    boolean showingfirst = false;
    TextView map_nearby,map_match;


    //map_and_navigation

    private  double  radius = 1000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_and_navigation);

        map_match = findViewById(R.id.map_match);
        map_nearby = findViewById(R.id.map_nearby);


        map_nearby.setOnClickListener(this);
        map_match.setOnClickListener(this);

        //map_and_navigation

        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);


        /// navigation

        drawer = (DrawerLayout)findViewById(R.id.drawer_layout);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        openDrawer();
        setToolbar();


//navigation start


        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer) {

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank
                super.onDrawerOpened(drawerView);
            }
        };


        drawer.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessary or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();
        actionBarDrawerToggle.setDrawerIndicatorEnabled(false);

        invalidateOptionsMenu();
    }


    @Override
        public boolean onOptionsItemSelected(MenuItem item) {
        // toggle nav drawer on selecting action bar app icon/title
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * When using the ActionBarDrawerToggle, you must call it during
     * onPostCreate() and onConfigurationChanged()...
     */

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggls
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }


    public void openDrawer(){
        drawer.openDrawer(navigationView);
    }



    private void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);///if error check
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("");
        toolbar.findViewById(R.id.navigation_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.e("Click", "keryu");

                if (drawer.isDrawerOpen(navigationView)) {
                    drawer.closeDrawer(navigationView);
                } else {
                    drawer.openDrawer(navigationView);

                    Log.e("abc","abc");
                }
            }
        });

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //navigation end

    //map_and_navigation start

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng latLng = new LatLng(22.306913, 73.179001);

        double lat = 22.306913;
        double lng =  73.179001;
        googleMap.addCircle(new CircleOptions()
                .center(new LatLng(lat,lng))
                .radius(radius)
                .strokeColor(Color.BLUE)
                .strokeWidth(0f)
                .fillColor(Color.parseColor("#500084d3")));
        // create marker
        MarkerOptions marker = new MarkerOptions().position(latLng).title("Your are here");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.ji));
        // adding marker
        googleMap.addMarker(marker);

        //    marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));

        CameraPosition cameraPosition = new CameraPosition.Builder().target(
                latLng).zoom(13).build();

        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

    }



    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.map_nearby:

                map_nearby.setTextColor(Color.parseColor("#fe7646"));
                map_match.setTextColor(Color.parseColor("#dbdbdb"));

                break;

            case R.id.map_match:

                map_match.setTextColor(Color.parseColor("#fe7646"));
                map_nearby.setTextColor(Color.parseColor("#dbdbdb"));

                break;
        }
    }
}

//map_and_navigation end
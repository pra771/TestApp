package com.example.chikapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class SideNavigation extends AppCompatActivity {
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_navigation);

        toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        nav = findViewById(R.id.navigationview);
        drawerLayout = findViewById(R.id.navside);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        drawerLayout.closeDrawer(GravityCompat.START);
        toggle.syncState();

        getSupportFragmentManager().beginTransaction().replace(R.id.container,new TopWareFragment()).commit();
        nav.setCheckedItem(R.id.topware);


        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            Fragment temp;

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.topware:
                        temp = new TopWareFragment();
                        break;
                    case R.id.beauty:
                        temp = new BeautyProductsFragment();
                        break;
                    case R.id.aboutus:
                        temp = new AboutusFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container, temp).commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
}
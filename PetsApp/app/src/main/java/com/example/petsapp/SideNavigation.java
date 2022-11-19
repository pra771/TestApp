package com.example.petsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

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

        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Dog_Fragment()).commit();
        nav.setCheckedItem(R.id.dog_icon);

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            Fragment temp;
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dog_icon:
                        temp = new Dog_Fragment();
                        break;

                    case R.id.cat_icon:
                        temp = new Cat_Fragment();
                        break;

                    case R.id.hitory:
                        temp = new History_Fragment();
                        break;

                    case R.id.aboutus:
                        temp = new AboutUs_Fragment();
                        break;

                    case R.id.tc:
                        temp = new TermsAndConductions_Fragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container,temp).commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
}
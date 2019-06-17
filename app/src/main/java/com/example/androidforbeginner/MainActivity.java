package com.example.androidforbeginner;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidforbeginner.Examples.Example;
import com.example.androidforbeginner.Tutorials.Item.ContainersActivity;
import com.example.androidforbeginner.Tutorials.Item.DataStorageActivity;
import com.example.androidforbeginner.Tutorials.Item.FragAndActActivity;
import com.example.androidforbeginner.Tutorials.Item.IntroductionActivity;
import com.example.androidforbeginner.Tutorials.Item.LayoutActivity;
import com.example.androidforbeginner.Tutorials.Item.MenuActivity;
import com.example.androidforbeginner.Tutorials.Item.PhpMySQLActivity;
import com.example.androidforbeginner.Tutorials.Item.SQLiteActivity;
import com.example.androidforbeginner.Tutorials.Item.StructureActivity;
import com.example.androidforbeginner.Tutorials.Item.UIWidgetActivity;
import com.example.androidforbeginner.Tutorials.TutorialFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";
    private SectionsPageAdapter sectionsPageAdapter;
    private DrawerLayout drawerLayout;
    private ViewPager viewPager;
    TextView txtTitle;
    SearchView searchViewExample;
    ExampleFragment fragment;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");
       // setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        StatusBar.changingStatusBar(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_24dp);

        drawerLayout = findViewById(R.id.drawer_layout);
        viewPager = findViewById(R.id.container);
        txtTitle = findViewById(R.id.txt_title);
        searchViewExample = findViewById(R.id.search_view_example);
        tabLayout = findViewById(R.id.tabMode);

        searchViewExample.setVisibility(View.GONE);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                    case 2:
                        searchViewExample.setVisibility(View.GONE);
                        break;
                    case 1:
                        searchViewExample.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        fragment = new ExampleFragment();

        searchViewExample.setSubmitButtonEnabled(false);
        setEventSearchView();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                // set item as selected to persist highlight
                menuItem.setChecked(true);
                switch (menuItem.getItemId()) {
                    case R.id.android:
                        Toast.makeText(MainActivity.this, "Welcome to Android", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rateUs:
                        Toast.makeText(MainActivity.this, "Thank you for rating us", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.donate:
                        Toast.makeText(MainActivity.this, "Thank you for donating us", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.feedback:
                        Toast.makeText(MainActivity.this, "Thank you for feedback us", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.moreTutorials:
                        Toast.makeText(MainActivity.this, "More Tutorials will come soon", Toast.LENGTH_SHORT).show();
                        break;
                }
                // close drawer when item is tapped
                drawerLayout.closeDrawers();

                // Add code here to update the UI based on the item selected
                // For example, swap UI fragments here

                return true;
            }
        });

        // set up viewpager
        sectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        setUpViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabMode);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setEventSearchView() {
        searchViewExample.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTitle.setVisibility(View.GONE);
            }
        });
        searchViewExample.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                txtTitle.setVisibility(View.VISIBLE);
                fragment.expandAll();
                return false;
            }
        });
        searchViewExample.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                fragment.filter(newText);
                return false;
            }
        });
    }

    private void setUpViewPager(final ViewPager viewPager) {

        sectionsPageAdapter.addFragment(new TutorialFragment(),"Tutorial");
        sectionsPageAdapter.addFragment(fragment,"Example");
        sectionsPageAdapter.addFragment(new QuizFragment(),"Quiz");
        viewPager.setAdapter(sectionsPageAdapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void TransformActivity(String TAG,int position) {
        Intent intent = null;
        switch (TAG) {
            case TutorialFragment.TAG:
                switch (position) {
                    case R.drawable.image_introduction:
                        intent = new Intent(this, IntroductionActivity.class);
                        break;
                    case R.drawable.image_stucture:
                        intent = new Intent(this, StructureActivity.class);
                        break;
                    case R.drawable.image_layouts:
                        intent = new Intent(this, LayoutActivity.class);
                        break;
                    case R.drawable.image_ui:
                        intent = new Intent(this, UIWidgetActivity.class);
                        break;
                    case R.drawable.image_activities_fragments:
                        intent = new Intent(this, FragAndActActivity.class);
                        break;
                    case R.drawable.image_menu:
                        intent = new Intent(this, MenuActivity.class);
                        break;
                    case R.drawable.image_containers:
                        intent = new Intent(this, ContainersActivity.class);
                        break;
                    case R.drawable.image_datastorage:
                        intent = new Intent(this, DataStorageActivity.class);
                        break;
                    case R.drawable.image_sqlite:
                        intent = new Intent(this, SQLiteActivity.class);
                        break;
                    case R.drawable.image_mysql_php:
                        intent = new Intent(this, PhpMySQLActivity.class);
                        break;

                }
                break;

        }
        if (intent != null) {
            startActivity(intent);
            overridePendingTransition(R.anim.anim_exit_left,R.anim.anim_enter_left);
        }

    }

}

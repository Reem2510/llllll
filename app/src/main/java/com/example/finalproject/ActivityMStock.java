package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.firebase.ktx.Firebase;

public class ActivityMStock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mstock);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ISTOCK");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayout, new Adduser());
        ft.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menufile,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:gotoFragment(R.id.settings);
                return true;
            case R.id.subadduserm:gotoFragment(R.id.subadduserm);
                return true;
            case R.id.subaddstockm:gotoFragment(R.id.subaddstockm);
                return true;
            default: return super.onOptionsItemSelected(item);
        }
        }
        public void gotoFragment(int frId) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            Fragment fr = null;
            switch (frId) {
                case R.id.settings:
                    fr = new Settingsfra();
                    break;

                case R.id.subaddstockm:
                    fr = new Addstockfragment();
                    break;
                case R.id.subadduserm:
                    fr = new Adduser();
                    break;
            }
            ft.replace(R.id.FrameLayoutMain,fr);
            ft.commit();

    }
}
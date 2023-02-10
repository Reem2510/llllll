package com.example.finalproject;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.ktx.Firebase;

public class ActivityMStock extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mstock);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

    }

    private void openFragment(Fragment fragment) {
        Log.d(TAG, "openFragment: ");
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
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
            case R.id.accountm:gotoFragment(R.id.accountm);
                return true;
            case R.id.home:gotoFragment(R.id.home);
                return true;
            case R.id.addda:gotoFragment(R.id.addda);
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

            case R.id.addda:
                fr = new Addstockfragment();
                break;
            case R.id.accountm:
                fr = new accountfra();
                break;
            case R.id.home:
                fr = new Mainfra();
                break;
        }
        ft.replace(R.id.FrameLayoutMain,fr);
        ft.commit();

    }

}
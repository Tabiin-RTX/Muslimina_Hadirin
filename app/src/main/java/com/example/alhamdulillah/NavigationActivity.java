package com.example.alhamdulillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        switch (MainActivity.SelectFragment) {
            case 1:
                getSupportFragmentManager().beginTransaction().replace(R.id.navigationlayout, new CounterFragment()).commit();
                break;

            case 2:
                getSupportFragmentManager().beginTransaction().replace(R.id.navigationlayout, new SalavatFragment()).commit();
                break;
        }
    }
}
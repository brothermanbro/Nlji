package com.example.nlji;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class naviActivity extends AppCompatActivity {
     recordActivity record;
     challengeAddActivity challange;
     albumActivity album;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi);
    record = new recordActivity();
    challange = new challengeAddActivity();
    album = new albumActivity();

    getSupportFragmentManager().beginTransaction().replace(R.id.container, record).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener(){
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch(item.getItemId()){
                            case R.id.home:
                                getSupportFragmentManager().beginTransaction().replace(R.id.container, record).commit();
                                return true;

                            case R.id.album:
                                getSupportFragmentManager().beginTransaction().replace(R.id.container, album).commit();
                                return true;

                            case R.id.challenge:
                                getSupportFragmentManager().beginTransaction().replace(R.id.container, challange).commit();
                                return true;
                        }
                       return false;
                    }
                }
        );
    }

}

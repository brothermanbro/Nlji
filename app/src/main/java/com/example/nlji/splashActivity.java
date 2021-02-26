package com.example.nlji;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class splashActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceStare){
        super.onCreate(savedInstanceStare);
        Intent intent = new Intent(this, beginActivity.class);
        startActivity(intent);
        finish();
            }
        }




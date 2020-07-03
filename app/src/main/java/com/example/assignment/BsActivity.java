package com.example.assignment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        SharedPreferences pref;
        SharedPreferences.Editor editor;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bs);

        Intent i = getIntent();
        String name = i.getExtras().getString("name");
        int number = i.getExtras().getInt("number");

        pref = getSharedPreferences("test", MODE_PRIVATE);
        editor = pref.edit();

        String result = pref.getString("memo", "");

    }
}

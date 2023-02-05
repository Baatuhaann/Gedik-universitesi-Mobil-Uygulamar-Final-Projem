package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class haber2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haber2);
    }
    public void anasayfa(View v) {
        Intent intent = new Intent(haber2.this, MainActivity.class);
        startActivity(intent);
    }
    public void haber(View v) {
        Intent intent = new Intent(haber2.this, Haberler.class);
        startActivity(intent);
    }

}
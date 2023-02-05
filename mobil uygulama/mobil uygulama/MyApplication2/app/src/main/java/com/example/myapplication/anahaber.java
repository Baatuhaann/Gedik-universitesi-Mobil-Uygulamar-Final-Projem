package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class anahaber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anahaber);
    }
    public void anahaber1 (View view) {
        Intent Batuhan = new Intent(anahaber.this,webgidecek.class);
        startActivity(Batuhan);
    }
    public void anahaber2 (View view) {
        Intent Batuhan = new Intent(anahaber.this,webgidecek.class);
        startActivity(Batuhan);
    }
    public void anahaber3 (View view) {
        Intent Batuhan = new Intent(anahaber.this,webgidecek.class);
        startActivity(Batuhan);
    }
    public void anahaber4 (View view) {
        Intent Batuhan = new Intent(anahaber.this,webgidecek.class);
        startActivity(Batuhan);
    }
    public void anasayfa(View v) {
        Intent intent = new Intent(anahaber.this, MainActivity.class);
        startActivity(intent);
    }
    public void haber(View v) {
        Intent intent = new Intent(anahaber.this, Haberler.class);
        startActivity(intent);
    }
    public void habergonder(View v) {
        Intent intent = new Intent(anahaber.this, anahaber.class);
        startActivity(intent);
    }
}
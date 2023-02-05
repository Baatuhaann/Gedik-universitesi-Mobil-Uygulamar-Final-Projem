package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Anasayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);

        TextView atxt2=(TextView) findViewById(R.id.girildi1);
        String vol1=getIntent().getStringExtra("deger");
        atxt2.setText(vol1.toString());

    }
    public void Tıkla (View view) {
        Intent Batuhan = new Intent(Anasayfa.this,Haberler.class);
        startActivity(Batuhan);
    }
}
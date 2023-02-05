package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Haberler extends AppCompatActivity {
    ImageView image1, image2;
    Button btnchange;
    Button btnchange1;

    public void init() {
        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        btnchange = (Button) findViewById(R.id.btnchange);
        btnchange1 = (Button) findViewById(R.id.btnchange1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haberler);
        init();
        btnchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (image2.getVisibility() == View.INVISIBLE) {
                    image2.setVisibility(View.VISIBLE);
                    image1.setVisibility(View.INVISIBLE);
                } else {
                    image2.setVisibility(View.INVISIBLE);
                    image1.setVisibility(View.VISIBLE);
                }
            }
        });
        btnchange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (image1.getVisibility() == View.INVISIBLE) {
                    image1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                } else {
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    public void haber11(View v) {
        Intent intent = new Intent(Haberler.this, Haber1.class);
        startActivity(intent);

    }

    public void haber22(View v) {
        Intent intent = new Intent(Haberler.this, haber2.class);
        startActivity(intent);
    }
    public void anasayfa(View v) {
        Intent intent = new Intent(Haberler.this, MainActivity.class);
        startActivity(intent);
    }
    public void haber(View v) {
        Intent intent = new Intent(Haberler.this, Haberler.class);
        startActivity(intent);
    }
    public void habergonder(View v) {
        Intent intent = new Intent(Haberler.this, anahaber.class);
        startActivity(intent);
    }
    public void haber6(View v) {
        Intent intent = new Intent(Haberler.this, anahaber.class);
        startActivity(intent);
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView KullaniciAdi = (TextView)  findViewById(R.id.KullaniciAdi);
        TextView Şifre = (TextView)  findViewById(R.id.Şifre);

        Button girisbuton = (Button)  findViewById(R.id.girisbuton);

       // girisbuton.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View v) {
                //if (KullanıcıAdı.getText().toString().equals("Batuhan") && Şifre.getText().toString().equals("123456"))

              // {
                   Toast.makeText(MainActivity.this, "Giriş Başarılı Hoşgeldiniz", Toast.LENGTH_SHORT).show();
              // }else
                 //  Toast.makeText(MainActivity.this, "Giriş Başarısız!!", Toast.LENGTH_SHORT).show();
            //}
       // });

    }
    public void giris (View v){
        Intent intent =new Intent(MainActivity.this,Anasayfa.class);
        startActivity(intent);
        EditText edit1=(EditText) findViewById(R.id.KullaniciAdi);
        intent.putExtra("deger",edit1.getText().toString());
        startActivity(intent);

    }
}
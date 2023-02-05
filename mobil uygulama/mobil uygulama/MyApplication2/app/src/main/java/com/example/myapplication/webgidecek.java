package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class webgidecek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webgidecek);
        WebView webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://shiftdelete.net/android-14-saglik-ve-fitness-alaninda-iddiali-health-connect");
        webview.loadUrl("https://shiftdelete.net/turkiyenin-en-guclu-milli-havacilik-motoru-burada-uretiliyor");
        webview.loadUrl("hhttps://shiftdelete.net/poco-m5s-kutu-acilisi");
        webview.loadUrl("https://shiftdelete.net/11-899-tlye-rx6600-hazir-sistem-inceleme");

    }

}
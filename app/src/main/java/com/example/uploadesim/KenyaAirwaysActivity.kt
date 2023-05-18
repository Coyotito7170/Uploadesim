package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class KenyaAirwaysActivity : AppCompatActivity() {
    lateinit var webKenyaAiways:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kenya_airways)
        webKenyaAiways = findViewById(R.id.webKenyaAirways)
        webKenyaAirways()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webKenyaAirways(){
        webKenyaAiways.webViewClient= WebViewClient()
        webKenyaAiways.apply {
            loadUrl("https://www.kenya-airways.com/ke/en/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webKenyaAiways.canGoBack())webKenyaAiways.goBack()else
            super.onBackPressed()
    }
}
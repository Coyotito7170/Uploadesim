package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class NtvActivity : AppCompatActivity() {
    lateinit var webNtv:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ntv)
        webNtv = findViewById(R.id.webNtv)
        webNtv()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webNtv(){
        webNtv.webViewClient= WebViewClient()
        webNtv.apply {
            loadUrl("https://ntvkenya.co.ke/news/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webNtv.canGoBack())webNtv.goBack()else
            super.onBackPressed()
    }
}
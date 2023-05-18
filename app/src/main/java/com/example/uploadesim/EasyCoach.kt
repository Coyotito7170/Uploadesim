package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class EasyCoach : AppCompatActivity() {
    lateinit var webEasyCoach:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_easy_coach)
        webEasyCoach = findViewById(R.id.mTvEasyCoach)
        webEasyCoach()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webEasyCoach(){
        webEasyCoach.webViewClient= WebViewClient()
        webEasyCoach.apply {
            loadUrl("https://ntvkenya.co.ke/news/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webEasyCoach.canGoBack())webEasyCoach.goBack()else
            super.onBackPressed()
    }
}
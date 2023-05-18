package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class NationActivity : AppCompatActivity() {
    lateinit var webNation:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nation)
        webNation = findViewById(R.id.webNation)
        webNation()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webNation(){
        webNation.webViewClient= WebViewClient()
        webNation.apply {
            loadUrl("https://opportunitiesforyoungkenyans.co.ke/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webNation.canGoBack())webNation.goBack()else
            super.onBackPressed()
    }
}
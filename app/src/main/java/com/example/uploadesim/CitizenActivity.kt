package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class CitizenActivity : AppCompatActivity() {
    lateinit var webCitizen: WebView

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_citizen)
        webCitizen = findViewById(R.id.webCitizen)
        webCitizen()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webCitizen(){
        webCitizen.webViewClient= WebViewClient()
        webCitizen.apply {
            loadUrl("https://citizen.digital/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webCitizen.canGoBack())webCitizen.goBack()else
            super.onBackPressed()
    }
}
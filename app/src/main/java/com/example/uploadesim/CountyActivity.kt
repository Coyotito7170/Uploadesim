package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class CountyActivity : AppCompatActivity() {
    lateinit var webCounty:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_county)
        webCounty = findViewById(R.id.webCounty)
        webCounty()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webCounty(){
        webCounty.webViewClient= WebViewClient()
        webCounty.apply {
            loadUrl("https://techweez.com/2023/04/04/safaricom-launches-my-county-app/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webCounty.canGoBack())webCounty.goBack()else
            super.onBackPressed()
    }
}
package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class AmrefActivity : AppCompatActivity() {
    lateinit var webAmref:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amref)
        webAmref = findViewById(R.id.webAmref)
        webAmref()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webAmref(){
        webAmref.webViewClient= WebViewClient()
        webAmref.apply {
            loadUrl("https://amref.org/kenya/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webAmref.canGoBack())webAmref.goBack()else
            super.onBackPressed()
    }
}
package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class NhifActivity : AppCompatActivity() {
    lateinit var webNhif:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nhif)
        webNhif = findViewById(R.id.mWebNhif)
        webNhif()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webNhif(){
        webNhif.webViewClient= WebViewClient()
        webNhif.apply {
            loadUrl("https://www.nhif.or.ke/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webNhif.canGoBack())webNhif.goBack()else
            super.onBackPressed()
    }
}
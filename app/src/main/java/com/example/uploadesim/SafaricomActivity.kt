package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class SafaricomActivity : AppCompatActivity() {
    lateinit var webSafaricom:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_safaricom)
        webSafaricom = findViewById(R.id.webSafaricom)
        webSafaricom()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webSafaricom(){
        webSafaricom.webViewClient= WebViewClient()
        webSafaricom.apply {
            loadUrl("https://accounts.safaricom.co.ke/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webSafaricom.canGoBack())webSafaricom.goBack()else
            super.onBackPressed()
    }
}
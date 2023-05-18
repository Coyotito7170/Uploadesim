package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class GojaraActivity : AppCompatActivity() {
    lateinit var webGojara:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gojara)
        webGojara = findViewById(R.id.webGojara)
        webGojara()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webGojara(){
        webGojara.webViewClient= WebViewClient()
        webGojara.apply {
            loadUrl("https://www.goojara.to/watch-series-genre")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webGojara.canGoBack())webGojara.goBack()else
            super.onBackPressed()
    }
}
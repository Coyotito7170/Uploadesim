package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class KuccpsActivity : AppCompatActivity() {
    lateinit var webKuccps:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuccps)
        webKuccps = findViewById(R.id.webKuccps)
        webKuccps()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webKuccps(){
        webKuccps.webViewClient= WebViewClient()
        webKuccps.apply {
            loadUrl("https://www.kuccps.net/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webKuccps.canGoBack())webKuccps.goBack()else
            super.onBackPressed()
    }

}
package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class DstvActivity : AppCompatActivity() {
    lateinit var webDstv:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dstv)
        webDstv = findViewById(R.id.webDstv)
        webDstv()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webDstv(){
        webDstv.webViewClient= WebViewClient()
        webDstv.apply {
            loadUrl("https://now.dstv.com/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webDstv.canGoBack())webDstv.goBack()else
            super.onBackPressed()
    }
}
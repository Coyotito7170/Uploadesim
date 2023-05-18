package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class KcbActivity : AppCompatActivity() {
    lateinit var webKcb:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcb)
        webKcb = findViewById(R.id.webKcb)
        webKcb()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webKcb(){
        webKcb.webViewClient= WebViewClient()
        webKcb.apply {
            loadUrl("https://ke.kcbgroup.com/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webKcb.canGoBack())webKcb.goBack()else
            super.onBackPressed()
    }
}
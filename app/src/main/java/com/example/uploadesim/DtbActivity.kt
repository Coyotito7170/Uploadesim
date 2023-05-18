package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class DtbActivity : AppCompatActivity() {
    lateinit var webDtb:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dtb)
        webDtb = findViewById(R.id.webDtb)
        webDtb()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webDtb(){
        webDtb.webViewClient= WebViewClient()
        webDtb.apply {
            loadUrl("https://dtbk.dtbafrica.com/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webDtb.canGoBack())webDtb.goBack()else
            super.onBackPressed()
    }
}
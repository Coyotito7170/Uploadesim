package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class UploadActivity : AppCompatActivity() {
    lateinit var webUpload:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload)
        webUpload = findViewById(R.id.webUpoad)
        webUpload()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webUpload(){
        webUpload.webViewClient= WebViewClient()
        webUpload.apply {
            loadUrl("https://geekflare.com/file-uploader-solutions/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webUpload.canGoBack())webUpload.goBack()else
            super.onBackPressed()
    }
}
package com.algebra.asynctask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient




class SecondActivity : AppCompatActivity( ) {

    private lateinit var webView : WebView

    override fun onCreate( savedInstanceState : Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_second )

        webView = findViewById( R.id.webView )

        webView.setWebViewClient( WebViewClient( ) )
        webView.loadUrl( "https://developer.android.com" )
        webView.settings.javaScriptEnabled = true
        webView.canGoBack( )

    }
}
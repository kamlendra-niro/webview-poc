package com.example.webviewpoc

import android.os.Bundle
import com.example.myapplication.NiroWebView

class CustomWebViewActivity : NiroWebView() {

    override fun onPageFinished() {
        println("CustomWebViewActivity#onPageFinished >>>> ")
    }
}
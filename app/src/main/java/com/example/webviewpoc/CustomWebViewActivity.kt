package com.example.webviewpoc

import com.example.myapplication.NiroWebView

class CustomWebViewActivity : NiroWebView() {

    override fun onPageFinished() {
        println("CustomWebViewActivity#onPageFinished >>>> ")
    }

    fun handleEvent(eventName: String) {
        println("CustomWebViewActivity#eventName >>>> $eventName")
    }
}
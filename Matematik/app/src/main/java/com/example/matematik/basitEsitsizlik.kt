package com.example.matematik

import android.graphics.Color
import com.google.android.gms.ads.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_basit_esitsizlik.*

class basitEsitsizlik : AppCompatActivity() {
    private var mAdView: AdView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basit_esitsizlik)

        basitGeceModu.setOnClickListener {
            if (basitGeceModu.isChecked){
                basitEkrann.setBackgroundColor(Color.parseColor("#FFC7B87F"))
                basitGeceModu.text="Gece modunu kapatmak için tıklayınız"
            }else{
                basitEkrann.setBackgroundColor(Color.WHITE)
                basitGeceModu.text="Gece Modu"
            }
        }
        MobileAds.initialize(this, "\n" + "ca-app-pub-6537190103014639~5855537118")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView!!.loadAd(adRequest)


        val adView = AdView(this)
        adView.adSize = AdSize.BANNER
        adView.adUnitId = "ca-app-pub-6537190103014639/8298222843"

        mAdView!!.adListener = object : AdListener() {
            override fun onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            override fun onAdFailedToLoad(errorCode: Int) {
                // Code to be executed when an ad request fails.
            }

            override fun onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            override fun onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            override fun onAdClosed() {
                // Code to be executed when when the user is about to return
                // to the app after tapping on an ad.
            }
        }
    }
}

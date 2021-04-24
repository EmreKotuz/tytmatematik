package com.example.matematik

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ayarlar.*

class ayarlar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayarlar)
        cografya.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://play.google.com/store/apps/details?id=com.kotuzapp.tytcografya")
            startActivity(openURL)
        }


        teşekkür.setOnClickListener {
            var intent=Intent(this,tesekkur::class.java)
            startActivity(intent)
        }
        bizeYazin.setOnClickListener {
            var intent=Intent(this,bizeYazinn::class.java)
            startActivity(intent)
        }
        insta.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data=Uri.parse("https://www.instagram.com/kotuz.akademi/")
            startActivity(openURL)
        }
    }
}

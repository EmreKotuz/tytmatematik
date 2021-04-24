package com.example.matematik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        girisBaşlama.setOnClickListener{
            var inten=Intent(this,anaSayfa::class.java)
            startActivity(inten)
        }

        ayarlar.setOnClickListener {
            var intent= Intent(this,com.example.matematik.ayarlar::class.java)
            startActivity(intent)
        }


    }
}

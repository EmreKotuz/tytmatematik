package com.example.matematik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ana_sayfa.*

class anaSayfa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ana_sayfa)

        temelKavramButton.setOnClickListener {
            var intent=Intent(this,temelKavramlar::class.java)
            startActivity(intent)
        }


        basitButton.setOnClickListener {
            var intent=Intent(this,basitEsitsizlik::class.java)
            startActivity(intent)
        }
        rasyonel.setOnClickListener {
            var intent=Intent(this,rasyonelSayiler::class.java)
            startActivity(intent)
        }
        koklu.setOnClickListener {
            var intent=Intent(this,kokluSayilar::class.java)
            startActivity(intent)
        }
        mutlak .setOnClickListener {
            var intent=Intent(this,mutlakDeger::class.java)
            startActivity(intent)

        }
        bölme.setOnClickListener {
            var intent=Intent(this,bolmeBolunebilme::class.java)
            startActivity(intent)
        }

    }
}

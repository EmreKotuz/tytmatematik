package com.example.matematik

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayiler.*

class sayiler : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayiler)

        geceModuSayiler.setOnClickListener {
            if (geceModuSayiler.isChecked){
                ekranSayilar.setBackgroundColor(Color.parseColor("#FFC7B87F"))
                geceModuSayiler.text="Gece modunu kapatmak için tıklayın"
            }else{
                ekranSayilar.setBackgroundColor(Color.WHITE)
                geceModuSayiler.text="Gece Modu"
            }
        }


    }
}

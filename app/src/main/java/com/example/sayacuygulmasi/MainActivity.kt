package com.example.sayacuygulmasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arttirBTNBaglantisi = findViewById<Button>(R.id.arttirBTN)
        val yaziTVBaglanti = findViewById<TextView>(R.id.yaziTV)
        val azaltBTNBaglantisi = findViewById<Button>(R.id.azaltBTN)

        var sayac = 0
        arttirBTNBaglantisi.setOnClickListener {
            sayac = sayac + 1
            yaziTVBaglanti.text = "Puan = " + sayac.toString()
        }

        azaltBTNBaglantisi.setOnClickListener {
            sayac = sayac - 1
            yaziTVBaglanti.text = "Puan = " + sayac.toString()
        }

    }
}
package com.example.myintentappfikri

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tombolKlik = findViewById<Button>(R.id.TombolMove)
        tombolKlik.setOnClickListener {
            klikOn()
        }
        val btndial = findViewById<Button>(R.id.tombolnomer)
        btndial.setOnClickListener {
            nomerklik()
        }
    }

    private fun nomerklik() {
        val telpnomer = "0895366870710"
        val nomert = Intent(Intent.ACTION_DIAL, Uri.parse("telp:" + telpnomer))
        startActivity(nomert)
    }

    private fun klikOn() {
        val intant = Intent(applicationContext, MovingActivity::class.java)
        startActivity(intant)
    }
}

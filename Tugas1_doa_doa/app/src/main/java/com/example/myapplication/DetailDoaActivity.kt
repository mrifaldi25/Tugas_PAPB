package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class DetailDoaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_doa)

        // TOOLBAR
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // AMBIL DATA
        val judul = intent.getStringExtra("judul")
        val gambar = intent.getIntExtra("gambar", 0)

        // ✅ FIX JUDUL + BACK BUTTON
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = judul ?: "Detail Doa"
        }

        toolbar.setNavigationOnClickListener {
            finish()
        }

        // TAMPILKAN GAMBAR
        val img = findViewById<ImageView>(R.id.imgDoa)
        if (gambar != 0) {
            img.setImageResource(gambar)
        }
    }
}
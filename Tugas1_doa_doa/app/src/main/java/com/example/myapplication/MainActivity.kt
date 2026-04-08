package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun doaSebelumMakan(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doabelummakan)
        intent.putExtra("judul", "Do'a Sebelum Makan")
        startActivity(intent)
    }

    fun doaSesudahMakan(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doasudahmakan)
        intent.putExtra("judul", "Do'a Sesudah Makan")
        startActivity(intent)
    }

    fun doaSebelumTidur(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doasebelumtidur)
        intent.putExtra("judul", "Do'a Sebelum Tidur")
        startActivity(intent)
    }

    fun doaSesudahTidur(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doabanguntidur)
        intent.putExtra("judul", "Do'a Bangun Tidur")
        startActivity(intent)
    }

    fun doaNiatWudhu(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doaniatwudhu)
        intent.putExtra("judul", "Do'a Niat Wudhu")
        startActivity(intent)
    }

    fun doaSetelahWudhu(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doasetelahwudhu)
        intent.putExtra("judul", "Do'a Setelah Wudhu")
        startActivity(intent)
    }

    fun doaUntukKeduaOrangTua(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doakkeduaortu)
        intent.putExtra("judul", "Do'a Untuk Kedua Orang Tua")
        startActivity(intent)
    }

    fun doaSebelumBelajar(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doasebelumbelajar)
        intent.putExtra("judul", "Do'a Sebelum Belajar")
        startActivity(intent)
    }

    fun doaSesudahBelajar(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doasesudahbelajar)
        intent.putExtra("judul", "Do'a Sesudah Belajar")
        startActivity(intent)
    }

    fun doaMasukMasjid(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doamasukmasjid)
        intent.putExtra("judul", "Do'a Masuk Masjid")
        startActivity(intent)
    }

    fun doaKeluarMasjid(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doakeluarmasjid)
        intent.putExtra("judul", "Do'a Keluar Masjid")
        startActivity(intent)
    }

    fun doaSelamatDuniaAkhirat(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doaselamatduniaakhirat)
        intent.putExtra("judul", "Do'a Agar Selamat Dunia Akhirat")
        startActivity(intent)
    }

    fun doaMenjengukOrangSakit(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doamenjengukorangsakit)
        intent.putExtra("judul", "Do'a Menjenguk Orang Sakit")
        startActivity(intent)
    }

    fun doaAgarDIbukakanPintuRezeki(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_diaagardibukakanpinturezeki)
        intent.putExtra("judul", "Do'a dibukakan Pintu Rizky")
        startActivity(intent)
    }

    fun doaHendakBerpergian(view: View) {
        val intent = Intent(this, DetailDoaActivity::class.java)
        intent.putExtra("gambar", R.drawable.ic_doahendakberpergian)
        intent.putExtra("judul", "Do'a Hendak Bepergian")
        startActivity(intent)
    }
}
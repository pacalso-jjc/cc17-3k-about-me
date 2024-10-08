package com.example.cc17_3f_aboutme

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cc17_3f_aboutme.adapter.AboutMeAdapter
import com.example.cc17_3f_aboutme.model.AboutMe

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

        val rvAboutMe: RecyclerView = findViewById(R.id.rvAboutMe)
        rvAboutMe.layoutManager = LinearLayoutManager(this)

        val aboutMe1 = AboutMe(R.mipmap.ic_launcher,
            "Jerry Junior Pacalso",
            "Short Desc",
            { view ->
                val intent = Intent(this, AboutJerryActivity::class.java)
                startActivity(intent)
            } )

        val aboutMe2 = AboutMe(R.drawable.jane_doe_dp,
            "Jane Doe",
            "ZZZ",
            {view ->
                val intent = Intent(this, AboutJaneDoeActivity::class.java)
                startActivity(intent)
            })

        val aboutMe48 = AboutMe(R.mipmap.psy,
            "Chris Paolo Sab-it",
            "Student",
            { view -> val intent = Intent(this, AboutPaoActivity::class.java)
                startActivity(intent)
            })

        val Tadena = AboutMe(R.drawable.tadena,
            "Princess Brylle N. Tadena",
            "Student",
            { view -> val intent = Intent(this, AboutTadenaActivity::class.java)
                startActivity(intent)
            })

        val deonTan = AboutMe(R.drawable.tanlauncher,
            "Tan, Deon R.",
            "BSCS Student",
            { view -> val intent = Intent(this, AboutTanActivity::class.java)
                startActivity(intent)
            })

        val rykielDelaCalzada = AboutMe(R.drawable.rykiel_delacalzada_dp,
            "Rykiel Louizze Dela Calzada",
            "BSIT - NetSec",
            {view ->
                val intent = Intent(this, AboutRykielActivity::class.java)
                startActivity(intent)
            })
        val iversonFerasan = AboutMe(R.drawable.iverson_ferasan_dp,
            "Iverson Fegcan Ferasan",
            "Student",
            {view ->
                val intent = Intent(this, AboutIversonActivity::class.java)
                startActivity(intent)
            })
        val aboutJohnLucky = AboutMe(R.drawable.johnlucky_dp,
            "John Lucky Louis Pilit",
            "It's lucky but unlucky",
            {view -> val intent = Intent(this, AboutLuckyActivity::class.java)
                startActivity(intent)
            })

        val aboutJedda = AboutMe(R.drawable.jedda_dp,
            "Jedda Mae Kidlongan",
            "Life is short...",
            {view -> val intent = Intent(this, AboutJeddaActivity::class.java)
                startActivity(intent)
            })

        val aboutShane = AboutMe(R.drawable.shane_dp,
            "Shane Denise Bergado",
            "Yung sinaing sunog na!",
            {view -> val intent = Intent(this, AboutShaneActivity::class.java)
                startActivity(intent)})

        val renzo = AboutMe(R.drawable.ic_launcher_foreground,
            "Renzo Fangonilo",
            "yEssS?",
            { view ->
                val intent = Intent(this, AboutRenzoActivity::class.java)
                startActivity(intent)
            })
        val aboutJhandel = AboutMe(R.drawable.jhandel_dp,
            "Jhandel K. Semion",
            "Coke tsaka JD",
            {view -> val intent = Intent(this, AboutJhandelActivity::class.java)
                startActivity(intent)
            })

        val aboutLeonor = AboutMe(R.drawable.leonor_dp,
            "Leonor T. Balintag",
            "I-Aguid",
            {view -> val intent = Intent(this, AboutLeonorActivity::class.java)
                startActivity(intent)})

        val aboutBanganan = AboutMe(R.drawable.jhon_dp,
            "John Michael M. Banganan",
            "Siak ni Titom",
            {view -> val intent = Intent(this, AboutBangananActivity::class.java)
                startActivity(intent)})

        val aboutFang = AboutMe(R.drawable.small_image,
            "Fang Zhao",
            "A passionate young people",
            {view ->
                val intent = Intent(this, AboutFangZhaoActivity::class.java)
                startActivity(intent)})
        val cyAcedera = AboutMe(R.drawable.acedera_dp,
            "Patricia Cyrine H. Acedera",
            "BSIT - NetSec"
        ) { view -> val intent = Intent(this, AboutAcederaActivity::class.java)
            startActivity(intent)
        }

        val aboutRovic = AboutMe(R.drawable.rovic_dp,
            "Rovic Roy",
            "BSIT - NETSEC",
            {view -> val intent = Intent(this, AboutRovicActivity::class.java)
                startActivity(intent)
            })

        val philipB = AboutMe(R.drawable.baladad_philip,
            "Philip Oliver M. Baladad",
            "Mabait na Nilalang",
            {view ->
                val intent = Intent(this, AboutPhilipActivity::class.java)
                startActivity(intent)
            })

        val christopherOrpilla = AboutMe(R.drawable.pixelated_cj,
            "CJ Orpilla",
            "BSIT - Web",
            {view ->
                val intent = Intent(this, AboutOrpillaActivity::class.java)
                startActivity(intent)
            })
        val charlesAgano = AboutMe(R.drawable.charles_a,"Charles Agano",
            "Lazy",
            {view -> val intent = Intent(this, AboutCharlesAganoActivity::class.java)
                startActivity(intent)})
        val aboutMe22 = AboutMe(R.drawable.arnawlto_dp,
            "Arnold Matias",
            "BSIT - NetSec",
            {view ->
                val intent = Intent(this, AboutArnoldActivity::class.java)
                startActivity(intent)
            })

        val arrList = listOf(aboutMe1, aboutMe2,
            aboutMe48,
            rykielDelaCalzada,
            iversonFerasan,
            aboutJohnLucky,
            aboutJedda,
            aboutShane,
            renzo,
            aboutJhandel,
            aboutLeonor,
            christopherOrpilla,
            philipB,
            aboutRovic,
            cyAcedera,
            charlesAgano,
            aboutMe22,
            aboutBanganan,
            aboutFang,
            deonTan,
            Tadena
        )

        rvAboutMe.adapter = AboutMeAdapter(arrList)
    }
}
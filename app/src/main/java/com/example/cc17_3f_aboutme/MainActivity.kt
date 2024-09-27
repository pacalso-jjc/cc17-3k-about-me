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

        val renzo = AboutMe(R.drawable.renzopogimo,
            "Renzo Pogimo",
            "Student",
            { view ->
                val intent = Intent(this, AboutRenzoActivity::class.java)
                startActivity(intent)
            })

        val arrList = listOf(aboutMe1, aboutMe2, aboutMe48, rykielDelaCalzada,iversonFerasan, aboutJohnLucky, aboutJedda, aboutShane, renzo)

        rvAboutMe.adapter = AboutMeAdapter(arrList)
    }
}
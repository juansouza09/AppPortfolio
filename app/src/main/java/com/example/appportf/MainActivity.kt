package com.example.appportf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cardProjetos = findViewById<View>(R.id.cardProjetos)
        var cardCursos = findViewById<View>(R.id.cardCursos)
        var cardSobre = findViewById<View>(R.id.cardSobre)
        var cardContato = findViewById<View>(R.id.cardContato)
        var cardSair = findViewById<View>(R.id.cardSair)

        cardProjetos?.setOnClickListener{
            setContentView(R.layout.fragment_projetos)
        }

        cardCursos?.setOnClickListener{
            setContentView(R.layout.fragment_cursos)
        }

        cardSobre?.setOnClickListener{
            setContentView(R.layout.fragment_sobre)
        }

        cardContato?.setOnClickListener{
            setContentView(R.layout.fragment_contato)
        }

        cardSair?.setOnClickListener{
            setContentView(R.layout.fragment_projetos)
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView)
        val navController = findNavController(R.id.navHostFragment)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.sobreFragment, R.id.projetosFragment, R.id.cursosFragment, R.id.contatoFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)

        bottomNavigationView.setupWithNavController(navController)
    }
}

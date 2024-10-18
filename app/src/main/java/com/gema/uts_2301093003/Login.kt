package com.gema.uts_2301093003


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {

    val btnLogin = findViewById<Button>(R.id.btnLogin)
    val suyo = findViewById<TextView>(R.id.suyo)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        enableEdgeToEdge()

        btnLogin.setOnClickListener {
            val intent = Intent (this, listOrder::class.java)
            startActivity(intent)
        }
        suyo.setOnClickListener {
            val intent = Intent (this, SignUp::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
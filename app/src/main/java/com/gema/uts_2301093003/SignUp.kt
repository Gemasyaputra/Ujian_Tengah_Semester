package com.gema.uts_2301093003

import android.annotation.SuppressLint
import android.content.Intent

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {

    val btnSignUp = findViewById<Button>(R.id.btnSignup)
    val tvForgotPassword = findViewById<TextView>(R.id.tvForgotPassword)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        btnSignUp.setOnClickListener {
            val intent = Intent (this, listOrder::class.java)
            startActivity(intent)
        }
        tvForgotPassword.setOnClickListener {
            val intent = Intent (this, Login::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
package com.gema.uts_2301093003

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartActivity : AppCompatActivity() {
    private lateinit var btn_login: Button
    private lateinit var btn_signup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start)

        btn_login = findViewById(R.id.button_login)
        btn_signup = findViewById(R.id.button_signup)

        btn_login.setOnClickListener() {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

        }

        btn_signup.setOnClickListener() {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}
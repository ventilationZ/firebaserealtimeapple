package com.example.firebaserealtimeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login_Activity : AppCompatActivity() {
    private lateinit var Btnlogin :Button
    private lateinit var BtnRegister :Button
    private lateinit var EdtEmail :TextView
    private lateinit var EdtPassword :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Btnlogin = findViewById(R.id.btnlogin)
        BtnRegister = findViewById(R.id.btnregister)
        EdtEmail = findViewById(R.id.edtemail)
        EdtPassword = findViewById(R.id.edtpassword)

        BtnRegister.setOnClickListener {
//            Navigate user to the registration page
            var gotoreg = Intent(this,RegisterActivity::class.java)
            startActivity(gotoreg)
        }
        Btnlogin.setOnClickListener {

        }
    }
}
package com.example.firebaserealtimeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    private lateinit var Btncreateacc : Button
    private lateinit var EdtNameReg : TextView
    private lateinit var EdtEmailReg : TextView
    private lateinit var EdtPasswordReg : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        Btncreateacc = findViewById(R.id.btncreateacc)
        EdtNameReg = findViewById(R.id.edtname)
        EdtEmailReg = findViewById(R.id.edtemailreg)
        EdtPasswordReg = findViewById(R.id.edtpasswordreg)

        Btncreateacc.setOnClickListener {

        }
    }
}
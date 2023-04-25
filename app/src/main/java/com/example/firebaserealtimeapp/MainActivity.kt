package com.example.firebaserealtimeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var BtnSave:Button
    private lateinit var data_imp:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BtnSave =findViewById(R.id.btnsave)
        data_imp =findViewById(R.id.edttxt)
        var database = FirebaseDatabase.getInstance()
        var databaseRef = database.reference

        BtnSave.setOnClickListener {
            var userdata = data_imp.text.toString().trim()
            databaseRef.setValue(userdata)

//Toast.makeText(this, "userdata", Toast.LENGTH_SHORT).show()
        }
    }
}
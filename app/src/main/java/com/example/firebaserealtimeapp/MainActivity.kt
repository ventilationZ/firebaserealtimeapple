package com.example.firebaserealtimeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var BtnView:Button
    private lateinit var BtnCarPhoto:Button
    private lateinit var BtnCarData:Button
    private lateinit var Make_imp:EditText
    private lateinit var Model_imp:EditText
    private lateinit var Price_imp:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BtnView =findViewById(R.id.btnsave)
        BtnCarPhoto =findViewById(R.id.btncarphoto)
        BtnCarData =findViewById(R.id.btncardata)
        Make_imp =findViewById(R.id.edtcarmake)
        Model_imp =findViewById(R.id.edtcarmodel)
        Price_imp =findViewById(R.id.edtcarprice)
        var database = FirebaseDatabase.getInstance()
        var databaseRef = database.getReference("cars")

        //Upload Car Photo
        BtnCarPhoto.setOnClickListener {

        }
        //Upload All Data
        BtnCarData.setOnClickListener {
            var carmake = Make_imp.text.toString().trim()
            var carmodel = Model_imp.text.toString().trim()
            var carprice = Price_imp.text.toString().trim()
            if (carmake.isEmpty()||carmodel.isEmpty()||carprice.isEmpty())
                Toast.makeText(this, "Can't submit an Empty Field", Toast.LENGTH_SHORT).show()
            else{
                //Proceed to save data
                var usercar = Car(carmake,carmodel,carprice)
                //Create a reference to FirebaseDataBase
                val ref  =FirebaseDatabase.getInstance().getReference().child("Cars")
                ref.setValue(usercar).addOnCompleteListener{
                    if (it.isSuccessful){
                        Toast.makeText(this,"Car Data Uploaded Successfully",
                            Toast.LENGTH_LONG).show()
                    }else{
                        Toast.makeText(this,"Failed tO Save Car Info",
                            Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
        //View Uploaded Data
        BtnView.setOnClickListener {



        }
    }
}
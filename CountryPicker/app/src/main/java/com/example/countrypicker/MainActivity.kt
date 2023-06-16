package com.example.countrypicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.hbb20.CountryCodePicker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaring ccp and editText
        val ccp: CountryCodePicker = findViewById(R.id.ccp)
        val etPhoneNumber: EditText= findViewById(R.id.etPhoneNumber)

        //Connecting editTextPhoneNumber with country code picker
        ccp.registerCarrierNumberEditText(etPhoneNumber)

        val btnCheck: Button = findViewById(R.id.btnCheck)
        btnCheck.setOnClickListener{
            Toast.makeText(this, "Number: " +ccp.fullNumber, Toast.LENGTH_LONG).show()
        }
    }
}
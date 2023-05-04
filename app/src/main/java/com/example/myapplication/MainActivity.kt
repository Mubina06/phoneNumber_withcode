package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.hbb20.CountryCodePicker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cpp: CountryCodePicker = findViewById(R.id.cpp)
        val et: EditText = findViewById(R.id.et)

        cpp.registerCarrierNumberEditText(et)


    }
}
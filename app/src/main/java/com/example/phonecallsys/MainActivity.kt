package com.example.phonecallsys

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.net.URI

class MainActivity : AppCompatActivity() {
    private lateinit var number : EditText
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number = findViewById(R.id.numberId)
        button = findViewById(R.id.callButton)

        button.setOnClickListener {
            val receiveNumber = number.text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$receiveNumber")
            startActivity(intent)
        }
    }
}
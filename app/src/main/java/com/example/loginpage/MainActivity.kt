package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val roomUserName = findViewById<EditText>(R.id.roomUserName)
        val joinbtn = findViewById<Button>(R.id.joinbtn)

        joinbtn.setOnClickListener {
            if(roomUserName.text.toString().isEmpty()) {
                Toast.makeText(this,"Please enter your name",Toast.LENGTH_SHORT).show()
            }else {
                val intent = Intent(this,VideoCall::class.java)
                intent.putExtra("callId",roomUserName.text.toString())
                startActivity(intent)
            }
        }

    }
}
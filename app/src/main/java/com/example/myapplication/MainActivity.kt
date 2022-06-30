package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editname = findViewById<EditText>(R.id.lo2)
        val editpass = findViewById<EditText>(R.id.lo3)
        val go = findViewById<Button>(R.id.lo4)
        val forget = findViewById<Button>(R.id.lo5)
        go.setOnClickListener{
            Log.i("admin","admin")
            var name = "admin"
            var pass = "admin"
            if(editname.text.toString() == name && editpass.text.toString() == pass  ) {
                Toast.makeText(this,"dang nhap thanh cong", Toast.LENGTH_LONG).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
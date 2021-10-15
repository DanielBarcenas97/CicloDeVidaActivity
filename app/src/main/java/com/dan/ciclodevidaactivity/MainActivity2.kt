package com.dan.ciclodevidaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn = findViewById<Button>(R.id.BtnNext)

        btn.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"Aqui esta el onRestart", Toast.LENGTH_SHORT).show()
    }
}
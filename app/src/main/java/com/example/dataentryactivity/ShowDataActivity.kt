package com.example.dataentryactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ShowDataActivity : AppCompatActivity() {
    lateinit var recieve_Name : TextView
    lateinit var recieve_Roll : TextView
    lateinit var recieve_weight : TextView
    lateinit var go_Back : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)

        recieve_weight = findViewById(R.id.get_Weight)
        recieve_Name = findViewById(R.id.get_Name)
        recieve_Roll = findViewById(R.id.get_Roll)



           intent?.let {
            val name = intent.getStringExtra("urName")
            recieve_Name.text = name

            val roll = intent.getStringExtra("urRoll")
            recieve_Roll.text = roll

            val weight = intent.getStringExtra("urWeight")
            recieve_weight.text = weight
        }
        go_Back =findViewById(R.id.go_Back)
        go_Back.setOnClickListener {

            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.example.dataentryactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var send_Name : EditText
    lateinit var send_Roll : EditText
    lateinit var send_Weight : EditText
    lateinit var send_Data : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        send_Data        = findViewById(R.id.send_Data)
        send_Weight = findViewById(R.id.send_Weight)
        send_Roll       = findViewById(R.id.send_Roll)
        send_Name       = findViewById(R.id.send_Name)

        send_Data.setOnClickListener {
            if (send_Name.text.isEmpty()){
                send_Name.error ="Enter Your Name"
                send_Name.requestFocus()
            }
            else if (send_Roll.text.isEmpty()){
                send_Roll.error ="Enter Your Roll Number"
                send_Roll.requestFocus()
            }
            else if (send_Weight.text.isEmpty()){
                send_Weight.error ="Enter Your Weight"
                send_Weight.requestFocus()
            }

            else {

                val intent = Intent(this, ShowDataActivity::class.java)
                intent.putExtra("urName", send_Name.text.toString())
                intent.putExtra("urRoll", send_Roll.text.toString())
                intent.putExtra("urWeight", send_Weight.text.toString())
//

                Toast.makeText(this, "Confrimed", Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
        }
    }

}
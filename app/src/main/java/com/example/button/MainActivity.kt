package com.example.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v:  View?) {
                Toast.makeText(this@MainActivity, "버튼이 눌렸습니다!!", Toast.LENGTH_LONG).show()
            }
        })
//        button.setOnClickListener {
//            Toast.makeText(applicationContext, "버튼 눌렀슈?", Toast.LENGTH_LONG).show()
//        }
    }
}
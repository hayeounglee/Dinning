package com.example.dinning

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class room_list : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_list)

        val buttonStart: Button = findViewById(R.id.add_room)
        val buttonStart2: Button = findViewById(R.id.btn_join)
        //val etName: AppCompatEditText = findViewById(R.id.et_search)

        /*if (etName.text.toString().isEmpty()) {
            Toast.makeText(this, "You can Search", Toast.LENGTH_SHORT).show()
        }*/

        buttonStart.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        buttonStart2.setOnClickListener {
            val intent = Intent(this, member_list::class.java)
            startActivity(intent)
        }
    }
}
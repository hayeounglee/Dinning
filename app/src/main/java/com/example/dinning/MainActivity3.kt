package com.example.dinning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val buttonStart: Button = findViewById(R.id.btn_next)
        val etName: AppCompatEditText = findViewById(R.id.et_id)

        // TODO (STEP 3: Now validate name is entered or not and launch the QuizQuestion Activity.)
        buttonStart.setOnClickListener {
            if (etName.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,MainActivity4::class.java)
                startActivity(intent)
            }
        }

    }
}
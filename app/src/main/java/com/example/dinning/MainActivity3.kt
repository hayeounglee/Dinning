package com.example.dinning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.dinning.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private var binding:ActivityMain3Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarExercise)
        getSupportActionBar()?.setTitle("Dining room");

        val buttonStart: Button = findViewById(R.id.btn_next)
        val etName: AppCompatEditText = findViewById(R.id.et_id)

        buttonStart.setOnClickListener {
            if (etName.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,MainActivity4::class.java)
                startActivity(intent)
            }
        }

        if (supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding?.toolbarExercise?.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        //Todo 4: TO avoid memory leak we unassign the binding once the activity is destroyed
        binding = null
    }

}
package com.example.dinning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.dinning.databinding.ActivityMain3Binding
import com.example.dinning.databinding.ActivityMemberListBinding
import com.example.dinning.databinding.ActivityRoomListBinding
import kotlinx.coroutines.launch

class member_list : AppCompatActivity() {

    private var binding: ActivityMemberListBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMemberListBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
    //Todo 1 create an employeeDao param to access the insert method
    //launch a coroutine block to call the method for inserting entry
    fun addRecord(employeeDao: EmployeeDAO) {
        val name = binding?.etName?.text.toString()
        val email = binding?.etEmailId?.text.toString()
        if (name.isNotEmpty() && email.isNotEmpty()) {
            lifecycleScope.launch {
                employeeDao.insert(EmployeeEntity(name = name, email = email))
                Toast.makeText(applicationContext, "Record saved", Toast.LENGTH_LONG).show()
                binding?.etName?.text?.clear()
                binding?.etEmailId?.text?.clear()
                }
            } else {
                Toast.makeText(
                    applicationContext,
                    "Name or Email cannot be blank",
                    Toast.LENGTH_LONG
                ).show()
            }
        }


}
package com.kotlin.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val emailAddress: String = "szsoroush@gmail.com"
    private val password: String = "123456"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailText = findViewById<TextView>(R.id.editTextTextEmailAddress)
        val passwordText = findViewById<TextView>(R.id.editTextTextPassword)


//        val myButton = findViewById<Button>(R.id.button)
//        myButton.setOnClickListener { emailText.text = "Shahin" }

        val myButton = findViewById<Button>(R.id.button)
        myButton.setOnClickListener { login(emailText.text.toString(), passwordText.text.toString()) }


    }


    private fun validateEmail(actualEmail: String, emailValue: String): Boolean{
        return actualEmail == emailValue
    }

    private fun validatePassword(actualPassword: String, passwordValue: String): Boolean{
        return actualPassword == passwordValue
    }

    private fun login(emailValue: String, passwordValue: String){
        val messageSuccessful: String = getString(R.string.register_msg_login_successful)
        val messageFailed: String = getString(R.string.register_error_login_failed)

        if (validateEmail(emailAddress, emailValue) and (validatePassword(password, passwordValue))){
            Toast.makeText(applicationContext, messageSuccessful, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(applicationContext, messageFailed, Toast.LENGTH_SHORT).show()
        }
    }
}

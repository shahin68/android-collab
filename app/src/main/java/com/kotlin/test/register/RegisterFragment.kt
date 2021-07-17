package com.kotlin.test.register

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kotlin.test.R

class RegisterFragment : Fragment() {

    private val emailAddress: String = "szsoroush@gmail.com"
    private val password: String = "123456"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val emailText = view.findViewById<TextView>(R.id.editTextTextEmailAddress)
        val passwordText = view.findViewById<TextView>(R.id.editTextTextPassword)


//        val myButton = view.findViewById<Button>(R.id.button)
//        myButton.setOnClickListener { emailText.text = "Shahin" }

        val myButton = view.findViewById<Button>(R.id.button)
        myButton.setOnClickListener {
//            login(emailText.text.toString(), passwordText.text.toString())
            navigateToHome()
        }


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
            Toast.makeText(context, messageSuccessful, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, messageFailed, Toast.LENGTH_SHORT).show()
        }
    }

    private fun navigateToHome() {
        // another way
        /*findNavController().navigate(
            R.id.homeFragment
        )*/

        // better way
        findNavController().navigate(
            RegisterFragmentDirections.actionRegisterFragmentToHomeFragment()
        )
    }
}
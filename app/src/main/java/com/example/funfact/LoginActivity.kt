package com.example.funfact


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.funfact.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var loginBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        loginBinding.signInBtn.setOnClickListener {
            if (!isPasswordValid()) {
                loginBinding.passwordTextInput.error =
                    "Password needs to contains at least 10 characters"
            } else {
                loginBinding.passwordTextInput.error = null
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            }
        }
        loginBinding.passwordEditText.setOnClickListener {
            if (!isPasswordValid()) {
                loginBinding.passwordTextInput.error =
                    "Password needs to contains at least 10 characters"
            } else {
                loginBinding.passwordTextInput.error = null
            }
        }
        loginBinding.signUpBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Nothing to do!", Toast.LENGTH_LONG).show()
        }
    }

    private fun isPasswordValid(): Boolean {
        return !(loginBinding.passwordEditText.text == null || loginBinding.passwordEditText.text!!.length <= 10)
    }
}
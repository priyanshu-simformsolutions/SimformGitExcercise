package simform.gitexcercise.android

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import simform.gitexcercise.android.databinding.ActivityLoginBinding
import simform.gitexcercise.android.validation.Validator
import simform.gitexcercise.android.validation.Validator.ValidCredentials

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupOnClicks()
    }

    private fun setupOnClicks() = with(binding) {
        btnLogin.setOnClickListener {
            performLogin()
        }
        tvForgotPassword.setOnClickListener {
            startActivity(Intent(this@LoginActivity, ForgotPasswordActivity::class.java))
        }
    }

    private fun performLogin() = with(binding) {
        val txtEmail = etEmail.text.trim().toString()
        val txtPassword = etPassword.text.trim().toString()
        when (Validator.isValidCredentials(email = txtEmail, password = txtPassword)) {
            ValidCredentials.VALID -> {
                Toast.makeText(
                    this@LoginActivity,
                    getString(R.string.msg_login_successfully),
                    Toast.LENGTH_SHORT
                ).show()
                gotoProfile()
            }

            ValidCredentials.INVALID_EMAIL -> {
                etEmail.error = getString(R.string.errr_valid_email)
            }

            ValidCredentials.INVALID_PASSWORD -> {
                etPassword.error = getString(R.string.err_password_8_chars)
            }
        }
    }

    private fun gotoProfile() {
        val intent = Intent(this@LoginActivity, ProfileActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
        startActivity(intent)
    }
}
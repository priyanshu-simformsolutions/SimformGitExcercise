package simform.gitexcercise.android

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import simform.gitexcercise.android.databinding.ActivityLoginBinding

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
            Toast.makeText(
                this@LoginActivity,
                getString(R.string.msg_login_successfully),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
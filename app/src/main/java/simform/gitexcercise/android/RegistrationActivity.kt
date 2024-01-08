package simform.gitexcercise.android

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import simform.gitexcercise.android.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupOnClicks()
    }

    private fun setupOnClicks() = with(binding) {
        btnRegistration.setOnClickListener {
            Toast.makeText(
                this@RegistrationActivity,
                getString(R.string.msg_registered_successfully),
                Toast.LENGTH_SHORT
            ).show()
            val intent = Intent(this@RegistrationActivity, ProfileActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            }
            startActivity(intent)
        }
    }
}
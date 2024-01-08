package simform.gitexcercise.android

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import simform.gitexcercise.android.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupOnClicks()
    }

    private fun setupOnClicks() = with(binding) {
        btnSendOtp.setOnClickListener {
            Toast.makeText(
                this@ForgotPasswordActivity,
                getString(R.string.msg_otp_sent),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
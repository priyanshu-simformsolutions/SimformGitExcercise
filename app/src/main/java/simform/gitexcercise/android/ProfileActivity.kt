package simform.gitexcercise.android

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import simform.gitexcercise.android.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupOnClicks()
        setupData()
    }

    private fun setupOnClicks() = with(binding) {
        btnEdit.setOnClickListener {
            Toast.makeText(
                this@ProfileActivity,
                getString(R.string.msg_upcoming_feature), Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun setupData() = with(binding) {
        tvName.text = getString(R.string.data_priyanshu_desai)
        tvEmail.text = getString(R.string.data_priyanshu_email)
    }
}
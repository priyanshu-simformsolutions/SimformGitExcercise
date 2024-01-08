package simform.gitexcercise.android

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import simform.gitexcercise.android.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupOnClicks()
        setupData()
    }

    private fun setupOnClicks() = with(binding) {
        btnSave.setOnClickListener {
            Toast.makeText(
                this@EditProfileActivity,
                getString(R.string.msg_name_saved),
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun setupData() = with(binding) {
        etName.setText(getString(R.string.data_priyanshu_desai))
        etEmail.setText(getString(R.string.data_priyanshu_email))
    }
}
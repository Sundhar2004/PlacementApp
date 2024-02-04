package multialert.android.myinterview.ui.user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import multialert.android.myinterview.R
import multialert.android.myinterview.databinding.ActivityJobDetailsBinding

class JobDetails : AppCompatActivity() {
    private lateinit var binding: ActivityJobDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJobDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addProfile.setOnClickListener {
            val intent = Intent(this, AddProfile::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, JobDetails::class.java)
        startActivity(intent)
    }
}
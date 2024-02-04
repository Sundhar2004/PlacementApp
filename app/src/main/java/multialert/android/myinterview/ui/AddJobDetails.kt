package multialert.android.myinterview.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import multialert.android.myinterview.R
import multialert.android.myinterview.databinding.ActivityAddJobDetailsBinding

class AddJobDetails : AppCompatActivity() {
    private lateinit var binding: ActivityAddJobDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddJobDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onBackPressed() {
        super.onBackPressed()

        val intent = Intent(this, ScheduledJobs::class.java)
        startActivity(intent)
    }
}
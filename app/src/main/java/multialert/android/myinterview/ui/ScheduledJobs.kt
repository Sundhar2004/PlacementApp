package multialert.android.myinterview.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import multialert.android.myinterview.R
import multialert.android.myinterview.databinding.ActivityScheduledJobsBinding

class ScheduledJobs : AppCompatActivity() {
    private lateinit var binding: ActivityScheduledJobsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScheduledJobsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addJob.setOnClickListener {
            val intent = Intent(this, AddJobDetails::class.java)
            startActivity(intent)
        }
    }
}
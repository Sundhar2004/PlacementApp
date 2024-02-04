package multialert.android.myinterview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import multialert.android.myinterview.databinding.ActivityLoginBinding
import multialert.android.myinterview.ui.ScheduledJobs
import multialert.android.myinterview.ui.user.JobDetails

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            validation()
            if (binding.usernameEt.text!!.toString() == "admin" && binding.passwordEt.text!!.toString() == "12345"){
                val intent = Intent(this, ScheduledJobs::class.java)
                startActivity(intent)
                finish()
            }else if(binding.usernameEt.text!!.toString() == "user" && binding.passwordEt.text!!.toString() == "12345"){
                val intent = Intent(this, JobDetails::class.java)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this,"Please Enter valid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validation(){
        if (binding.usernameEt.text.toString().isNullOrEmpty()){
            Toast.makeText(this,"Please Enter username", Toast.LENGTH_SHORT).show()
        }else if(binding.passwordEt.text.toString().isNullOrEmpty()){
            Toast.makeText(this,"Please Enter Password", Toast.LENGTH_SHORT).show()
        }else{

        }
    }
}
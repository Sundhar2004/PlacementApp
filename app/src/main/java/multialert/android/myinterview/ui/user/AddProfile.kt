package multialert.android.myinterview.ui.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import multialert.android.myinterview.R
import multialert.android.myinterview.databinding.ActivityAddProfileBinding
import multialert.android.myinterview.databinding.ActivityLoginBinding

class AddProfile : AppCompatActivity() {
    private lateinit var binding: ActivityAddProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
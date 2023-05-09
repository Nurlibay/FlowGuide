package uz.nurlibay.flowguide.livedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import uz.nurlibay.flowguide.databinding.ActivityLivedataBinding

class LiveDataActivity: AppCompatActivity() {

    private lateinit var binding: ActivityLivedataBinding
    private lateinit var viewModel: LiveDataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLivedataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[LiveDataViewModel::class.java]

        viewModel.liveData.observe(this){
            binding.text.text = it.toString()
        }
    }
}
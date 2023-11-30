package com.bluetech.androidbasicapp.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.bluetech.androidbasicapp.common.Resource
import com.bluetech.androidbasicapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        lifecycleScope.launch {
           // repeatOnLifecycle(Lifecycle.State.STARTED) {
                    viewModel.articleData.collect {uiState ->
                        when(uiState) {
                            is Resource.Success -> {
                                binding.txt.text = uiState.data?.articles?.joinToString(separator = "\n\n-->" )
                            }
                            is Resource.Error -> Toast.makeText(applicationContext, "There is no data", Toast.LENGTH_SHORT).show()
                            is Resource.Loading -> {}
                            else -> {}
                        }
                    }
          //  }
        }
    }
}

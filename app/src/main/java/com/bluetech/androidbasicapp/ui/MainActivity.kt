package com.bluetech.androidbasicapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bluetech.androidbasicapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
   lateinit var viewModel: MainViewModel
   lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.articleData.observe(this) {

            binding.txt.text = it.articles.joinToString(separator = "\n\n-->")
        }
    }
}

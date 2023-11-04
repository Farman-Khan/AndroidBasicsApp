package com.bluetech.androidbasicapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.bluetech.androidbasicapp.R
import com.bluetech.androidbasicapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   lateinit var viewModel: MainViewModel
   lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.articleData.observe(this) {
            println("panda: Result: $it")
            binding.txt.text = it.articles.joinToString(separator = "\n\n-->")
        }
    }
}
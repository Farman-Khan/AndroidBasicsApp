package com.bluetech.androidbasicapp.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bluetech.androidbasicapp.adapter.ArticleAdapter
import com.bluetech.androidbasicapp.databinding.ActivityMainBinding
import com.bluetech.androidbasicapp.domain.model.UiState

class MainActivity : AppCompatActivity() {
   private lateinit var viewModel: MainViewModel
   private lateinit var binding: ActivityMainBinding
   private lateinit var articleAdapter: ArticleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        articleAdapter = ArticleAdapter()
        binding.recyclerView.adapter = articleAdapter
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel.uiState.observe(this) { uiState ->
                 when(uiState) {
                     is UiState.Success -> {
                         articleAdapter.submitList(uiState.articles)
                     }
                     is UiState.Error -> {

                     }
                     is UiState.Empty -> {
                         Toast.makeText(this, "List is empty", Toast.LENGTH_LONG).show()
                     }
                     else -> {

                     }
                 }
        }
    }
}
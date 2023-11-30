package com.bluetech.androidbasicapp.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.bluetech.androidbasicapp.common.Resource
import com.bluetech.androidbasicapp.databinding.ActivityMainBinding
import com.bluetech.androidbasicapp.domain.model.Article
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var articleAdapter: ArticleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        articleAdapter = ArticleAdapter()
        binding.recyclerView.adapter = articleAdapter
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        lifecycleScope.launch {
           // repeatOnLifecycle(Lifecycle.State.STARTED) {
                    viewModel.articleData.collect {uiState ->
                        when(uiState) {
                            is Resource.Success -> {
                                articleAdapter.submitList(uiState.data?.articles)
                            }
                            is Resource.Error -> {
                                Toast.makeText(applicationContext, "There is no data", Toast.LENGTH_SHORT).show()
                                articleAdapter.submitList(emptyList())
                            }
                            is Resource.Loading -> {}
                            else -> {}
                        }
                    }
          //  }
        }
    }
}

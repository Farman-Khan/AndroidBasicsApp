package com.bluetech.androidbasicapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bluetech.androidbasicapp.R
import com.bluetech.androidbasicapp.databinding.ItemArticleBinding
import com.bluetech.androidbasicapp.domain.model.Article

class ArticleAdapter : ListAdapter<Article, ArticleAdapter.ArticleViewHolder>(ArticleDiffCallback()) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ArticleViewHolder {
        val binding = ItemArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ArticleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
       val article = getItem(position)
        holder.bind(article, position+1)
    }

    inner class ArticleViewHolder(private val binding: ItemArticleBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(article: Article, index: Int) {
            val context = binding.root.context
            val formattedText = context.getString(R.string.author_with_index, index, article.author)
            binding.textAuthorName.text = formattedText
        }
    }
}

private class ArticleDiffCallback: DiffUtil.ItemCallback<Article>() {
    override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
        return oldItem.author == newItem.author
    }

    override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
        return oldItem == newItem
    }
}
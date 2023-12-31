package com.catnip.egroceries.presentation.home.adapter.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.catnip.egroceries.core.ViewHolderBinder
import com.catnip.egroceries.databinding.ItemEmptyViewHolderBinding
import com.catnip.egroceries.presentation.home.adapter.model.HomeSection

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class EmptyViewHolder(private val binding : ItemEmptyViewHolderBinding) : ViewHolder(binding.root), ViewHolderBinder<HomeSection> {
    override fun bind(item: HomeSection) {
        //no-op
    }
}
package com.feature.merchant.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import app.beelabs.com.mopay.model.pojo.Product
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.feature.merchant.R
import kotlinx.android.synthetic.main.item_grid_product.view.*

class GridProductAdapter(var data: ArrayList<Product>, var context: Context) :
    RecyclerView.Adapter<GridProductAdapter.ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_grid_product, parent, false)
        )
    }

    override fun getItemViewType(position: Int): Int {
        return 1
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        var intDrawable =
            if (position % 2 == 0) R.drawable.sample_kangkung else R.drawable.sample_pakcoy

        Glide.with(context).load(intDrawable)
            .transform(RoundedCorners(10))
            .transition(DrawableTransitionOptions.withCrossFade()).into(holder.imgPhoto!!)
    }

    override fun getItemCount(): Int = 5

    class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imgPhoto: ImageView? = null

        init {
            imgPhoto = view.img_item_photo
        }
    }
}
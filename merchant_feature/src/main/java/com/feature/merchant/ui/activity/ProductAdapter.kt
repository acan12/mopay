package com.feature.merchant.ui.activity

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.beelabs.com.mopay.model.pojo.Product
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.feature.merchant.R
import kotlinx.android.synthetic.main.row_product_adapter.view.*

class ProductAdapter(private val list: List<Product>, var onProductClickItemListener: OnProductClickItemListener) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder> () {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {

        val layout = LayoutInflater.from(parent.context).inflate(
            R.layout.row_product_adapter, parent, false)
        return ProductViewHolder(
            layout,
            onProductClickItemListener
        )
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
//        holder.itemView.imageProduct.load("https://i.ibb.co/TRTpb0N/download.png")
        Glide.with(onProductClickItemListener as Activity).load(R.drawable.demo_food)
            .transform(RoundedCorners(10))
            .transition(DrawableTransitionOptions.withCrossFade()).into(holder.itemView.imageProduct)
    }

    interface OnProductClickItemListener {
        fun onClickListener(v: View, pos: Int)
    }


    class ProductViewHolder(itemView: View, onProductClickItemListener: OnProductClickItemListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener{

        private var nameProductView: TextView? = null
        private var priceProductView: TextView? = null
        private var onProductClickItemListener: OnProductClickItemListener? = null

        init {
            nameProductView = itemView.findViewById(R.id.nameProduct)
            priceProductView = itemView.findViewById(R.id.priceProduct)
            this.onProductClickItemListener = onProductClickItemListener
            itemView.setOnClickListener(this)
        }


        override fun onClick(view: View?) {
            onProductClickItemListener!!.onClickListener(view!!, adapterPosition)
        }
    }

}
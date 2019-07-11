package app.beelabs.com.mopay.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.beelabs.com.mopay.R
import kotlinx.android.synthetic.main.content_cart_adapter.view.*

class CartAdapter(val context: Context) :
    RecyclerView.Adapter<CartAdapter.CartViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        return CartViewHolder(LayoutInflater.from(context).inflate(R.layout.content_cart_adapter, parent, false))
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(viewHolder: CartViewHolder, pos: Int) {
        if (pos == 2) {
            viewHolder.itemView.verticalLine.visibility = View.GONE
        }
    }


    class CartViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }
}
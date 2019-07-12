package app.beelabs.com.mopay.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.beelabs.com.codebase.support.util.MoneyUtil
import app.beelabs.com.mopay.App.Companion.context
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.model.pojo.CartMapper
import kotlinx.android.synthetic.main.content_cart_adapter.view.*

class CartAdapter(var cart: CartMapper, var context: Context) :
    RecyclerView.Adapter<CartAdapter.CartViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        return CartViewHolder(LayoutInflater.from(context).inflate(R.layout.content_cart_adapter, parent, false))
    }

    override fun getItemCount(): Int {
        return cart.data!!.order!!.size
    }

    override fun onBindViewHolder(viewHolder: CartViewHolder, pos: Int) {
        var item = viewHolder.itemView
        var order = cart.data!!.order!!

        item.itemTitle.text = order.get(pos).detailName
        item.itemContent.text = MoneyUtil.convertIDRCurrencyFormat(order.get(pos).detailPrice)
        if (pos == cart.data!!.order!!.size - 1) {
            item.verticalLine.visibility = View.GONE
        }
    }


    class CartViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }
}
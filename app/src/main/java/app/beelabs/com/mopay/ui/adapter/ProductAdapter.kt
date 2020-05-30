package app.beelabs.com.mopay.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.model.pojo.Product

class ProductAdapter(private val list: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder> () {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ProductViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
//        val item: Product = list[position]
//        holder.bind(item)
    }



    class ProductViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder( inflater.inflate(
        R.layout.row_product_adapter, parent, false)){

        private var nameProductView: TextView? = null
        private var priceProductView: TextView? = null

        init {
            nameProductView = itemView.findViewById(R.id.nameProduct)
            priceProductView = itemView.findViewById(R.id.priceProduct)
        }

        fun bind(item: Product){
//            nameProduct?.text =
//            priceProductView?.text =
        }
    }

}
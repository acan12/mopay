package app.beelabs.com.mopay.ui.activity.product

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.ui.`interface`.IMainView
import app.beelabs.com.mopay.ui.adapter.CartAdapter
import kotlinx.android.synthetic.main.activity_cart_product.*

class CartProductActivity : BaseActivity(), IMainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart_product)

        cartOrderList.setHasFixedSize(true)
        cartOrderList.layoutManager = LinearLayoutManager(this)
        cartOrderList.adapter = CartAdapter(this)

    }
}



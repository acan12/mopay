package com.mojual.merchant.ui.activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import app.beelabs.com.mopay.model.pojo.Product
import app.beelabs.com.mopay.ui.activity.AppActivity
import app.beelabs.com.mopay.ui.adapter.ProductAdapter
import com.mojual.merchant.R
import kotlinx.android.synthetic.main.activity_merchant_home.*


class MerchantHomeActivity : AppActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_merchant_home)
        setupLightStatusBarMode()

        val value = intent.getIntExtra("data", 0)
        deliverToText.text = "Balance : Rp $value"

        dataProduct.apply {
            layoutManager = LinearLayoutManager(this@MerchantHomeActivity)
            adapter = ProductAdapter(ArrayList<Product>())
        }
    }
}
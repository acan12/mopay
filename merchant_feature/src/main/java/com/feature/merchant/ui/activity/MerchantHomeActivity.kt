package com.feature.merchant.ui.activity

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import app.beelabs.com.codebase.support.rx.RxTimer
import app.beelabs.com.mopay.model.pojo.Product
import app.beelabs.com.mopay.ui.activity.AppActivity
import app.beelabs.com.mopay.ui.component.view.GridItemDecoration
import com.feature.merchant.databinding.ActivityMerchantHomeBinding
import com.feature.merchant.ui.adapter.GridProductAdapter
import com.feature.merchant.ui.adapter.ProductAdapter
import kotlinx.android.synthetic.main.activity_merchant_home.*


class MerchantHomeActivity : AppActivity(), ProductAdapter.OnProductClickItemListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMerchantHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupLightStatusBarMode()
        Toast.makeText(this, "Load Merchant !!", Toast.LENGTH_SHORT).show()
        val value = intent.getIntExtra("data", 0)
        binding.tvDeliverText.text = "Balance : Rp $value"


        RxTimer.doTimer(1000, false, object : RxTimer() {
            override fun onCallback(along: Long?) {
                with(binding) {
                    rvProductList.hasFixedSize()
                    rvProductList.setItemViewCacheSize(20)
                    rvProductList.addItemDecoration(GridItemDecoration(10))
                    rvProductList.apply {
                        layoutManager = GridLayoutManager(this@MerchantHomeActivity, 3)
                        adapter =
                            GridProductAdapter(ArrayList<Product>(), this@MerchantHomeActivity)

                    }
                }
            }
        })

    }

    override fun onClickListener(v: View, pos: Int) {
        Toast.makeText(this, "Product Listener #$pos", Toast.LENGTH_SHORT).show()
    }
}
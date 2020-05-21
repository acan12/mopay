package app.beelabs.com.mopay.ui.activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.model.pojo.Product
import app.beelabs.com.mopay.ui.adapter.ProductAdapter
import app.beelabs.com.mopay.ui.impl.IMainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppActivity(), IMainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupLightStatusBarMode()

        dataProduct.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ProductAdapter(ArrayList<Product>())
        }
    }
}



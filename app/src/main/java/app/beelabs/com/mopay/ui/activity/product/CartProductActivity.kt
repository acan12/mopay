package app.beelabs.com.mopay.ui.activity.product

import android.os.Bundle
import android.webkit.WebSettings
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.mopay.IConfig
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.ui.`interface`.IMainView
import app.beelabs.com.mopay.ui.activity.HelloWorldClient
import kotlinx.android.synthetic.main.activity_main.*

class CartProductActivity : BaseActivity(), IMainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timeline)

    }
}



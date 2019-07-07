package app.beelabs.com.mopay.ui.activity

import android.os.Bundle
import android.webkit.WebSettings
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.mopay.IConfig
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.ui.`interface`.IMainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), IMainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        IConfig.APPCONFIG.BASE_API_URL

        webViewLayout.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
        webViewLayout.settings.javaScriptEnabled = true
        webViewLayout.webViewClient = HelloWorldClient(progressWeb, webViewLayout)
        webViewLayout.loadUrl("https://www.github.com/")
    }
}



package app.beelabs.com.mopay.ui.activity

import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
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


class HelloWorldClient(
    var progressWeb: ProgressBar,
    var webViewLayout: WebView) : WebViewClient() {

    init {
        this.progressWeb = progressWeb
        this.webViewLayout = webViewLayout
    }

    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
        view?.loadUrl(url)

        return true
    }

    override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
        super.onPageStarted(view, url, favicon)
        showProgressWeb(progressWeb, webViewLayout, true)
    }

    override fun onPageFinished(view: WebView?, url: String?) {
        super.onPageFinished(view, url)
        showProgressWeb(progressWeb, webViewLayout, false)
    }

    fun showProgressWeb(progressWeb: ProgressBar, webViewLayout: WebView, isShow: Boolean) {
        if (isShow) {
            progressWeb.visibility = View.VISIBLE
            webViewLayout.visibility = View.GONE
        } else {
            progressWeb.visibility = View.GONE
            webViewLayout.visibility = View.VISIBLE
        }
    }

}

package app.beelabs.com.mopay.ui.activity

import android.graphics.Bitmap
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar

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

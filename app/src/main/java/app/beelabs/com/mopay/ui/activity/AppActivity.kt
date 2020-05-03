package app.beelabs.com.mopay.ui.activity

import android.view.View
import app.beelabs.com.codebase.base.BaseActivity

open class AppActivity : BaseActivity() {

    protected fun setupLightStatusBarMode() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    }
}
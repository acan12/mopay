package app.beelabs.com.mopay.ui.activity

import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.mopay.IConfig
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.ui.`interface`.IMainView

class MainActivity : BaseActivity(), IMainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        IConfig.APPCONFIG.BASE_API_URL
    }
}

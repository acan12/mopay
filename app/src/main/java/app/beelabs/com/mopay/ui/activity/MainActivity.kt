package app.beelabs.com.mopay.ui.activity

import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.ui.impl.IMainView

class MainActivity : BaseActivity(), IMainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}



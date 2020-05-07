package app.beelabs.com.mopay.ui.activity.intro

import android.os.Bundle
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.ui.activity.AppActivity

class SplashscreenActivity : AppActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupLightStatusBarMode()
        setContentView(R.layout.activity_splashscreen)
    }
}
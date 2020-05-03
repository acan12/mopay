package app.beelabs.com.mopay.ui.activity

import android.os.Bundle
import app.beelabs.com.mopay.R

class OnboardingActivity : AppActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        setupLightStatusBarMode()
    }
}
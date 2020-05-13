package app.beelabs.com.mopay.ui.activity.intro

import android.content.Intent
import android.os.Bundle
import app.beelabs.com.codebase.support.rx.RxTimer
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.ui.activity.AppActivity
import app.beelabs.com.mopay.ui.activity.MainActivity

class SplashscreenActivity : AppActivity() {

    private lateinit var splashIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        if (true)
            splashIntent = Intent(SplashscreenActivity@ this, OnboardingActivity::class.java)
        else
            splashIntent = Intent(SplashscreenActivity@ this, MainActivity::class.java)
        RxTimer.doTimer(10000, false, object : RxTimer() {
            override fun onCallback(along: Long?) {
                startActivity(splashIntent)
                finish()
            }
        })
    }
}
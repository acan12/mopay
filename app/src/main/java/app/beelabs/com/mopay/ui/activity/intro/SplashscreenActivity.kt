package app.beelabs.com.mopay.ui.activity.intro

import android.content.Intent
import android.os.Bundle
import app.beelabs.com.codebase.support.rx.RxTimer
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.ui.activity.AppActivity

class SplashscreenActivity : AppActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        intent = Intent(SplashscreenActivity@this, OnboardingActivity::class.java)
        RxTimer.doTimer(10000, false, object: RxTimer(){
            override fun onCallback(along: Long?) {

                startActivity(intent)
                finish()

            }
        })
    }
}
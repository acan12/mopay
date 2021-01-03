package app.beelabs.com.mopay.ui.component.di.manager.nav

import android.content.Intent
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.mopay.ui.activity.MainActivity
import app.beelabs.com.mopay.ui.component.di.impl.IHomeNavigation

class HomeNavigation : IHomeNavigation {
    override fun goDashboardPage(activity: BaseActivity) {

        var intent = Intent(activity, MainActivity::class.java)
//        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        activity.startActivity(intent)
        activity.finish()
    }
}
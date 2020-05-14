package app.beelabs.com.mopay.ui.component.di.manager.nav

import android.content.Intent
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.mopay.ui.activity.MainActivity
import com.demo.bee.ui.component.impl.IHomeNavigation

class HomeNavigation : IHomeNavigation {
    override fun goDashboardPage(activity: BaseActivity) {

        activity.startActivity(Intent(activity, MainActivity::class.java))
        activity.finish()
    }
}
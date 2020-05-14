package app.beelabs.com.mopay.ui.component.di.manager

import android.content.Context
import android.widget.Toast
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.mopay.App
import app.beelabs.com.mopay.ui.component.di.IListener

class ListenerManager : IListener {
    override fun textChangeListener(context: Context) {
        Toast.makeText(context, "Load Listener", Toast.LENGTH_LONG).show()
    }

    override fun nextOnboardingListener(activity: BaseActivity) {
        App.getNavigationComponent().homeNavigation().goDashboardPage(activity)
    }
}
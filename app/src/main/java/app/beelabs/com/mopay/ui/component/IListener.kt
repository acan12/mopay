package app.beelabs.com.mopay.ui.component

import android.content.Context
import app.beelabs.com.codebase.base.BaseActivity

interface IListener {

    fun textChangeListener(context: Context)

    fun nextOnboardingListener(activity: BaseActivity)
}
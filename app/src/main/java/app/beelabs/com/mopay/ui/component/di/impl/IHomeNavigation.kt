package app.beelabs.com.mopay.ui.component.di.impl

import app.beelabs.com.codebase.base.BaseActivity
import com.demo.bee.ui.component.impl.IBaseNavigation

interface IHomeNavigation : IBaseNavigation {

    fun goDashboardPage(activity: BaseActivity)

}
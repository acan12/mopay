package app.beelabs.com.mopay.ui.component.di.impl

import com.demo.bee.ui.component.impl.IBaseNavigation

interface INavigation : IBaseNavigation {

    fun homeNavigation(): IHomeNavigation

}
package app.beelabs.com.mopay.ui.component.di.manager

import app.beelabs.com.mopay.App
import app.beelabs.com.mopay.ui.component.di.impl.INavigation
import app.beelabs.com.mopay.ui.component.di.manager.nav.HomeNavigation
import com.demo.bee.ui.component.impl.IHomeNavigation

class NavigationManager : INavigation {

    override fun homeNavigation(): IHomeNavigation {
        return App.uiComponent?.inject(HomeNavigation())!!
    }
}
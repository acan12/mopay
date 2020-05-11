package app.beelabs.com.mopay.ui.component.manager

import app.beelabs.com.mopay.App
import app.beelabs.com.mopay.ui.component.impl.INavigation
import app.beelabs.com.mopay.ui.component.manager.nav.HomeNavigation
import com.demo.bee.ui.component.impl.IHomeNavigation

class NavigationManager : INavigation {

    override fun homeNavigation(): IHomeNavigation {
        return App.uiComponent?.inject(HomeNavigation())!!
    }
}
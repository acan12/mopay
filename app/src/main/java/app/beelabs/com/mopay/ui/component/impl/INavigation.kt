package app.beelabs.com.mopay.ui.component.impl

import com.demo.bee.ui.component.impl.IBaseNavigation
import com.demo.bee.ui.component.impl.IHomeNavigation

interface INavigation : IBaseNavigation {

    fun homeNavigation(): IHomeNavigation

}
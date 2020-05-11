package app.beelabs.com.mopay.ui.component

import app.beelabs.com.codebase.di.component.AppComponent
import app.beelabs.com.mopay.ui.component.module.NavModule
import app.beelabs.com.mopay.ui.component.scope.UIScope
import com.demo.bee.ui.component.impl.IHomeNavigation
import app.beelabs.com.mopay.ui.component.impl.INavigation
import dagger.Component

@UIScope
@Component(modules = [NavModule::class], dependencies = [AppComponent::class])
interface UIComponent {
    fun inject(iNavigation: INavigation): INavigation
    fun inject(iHomeNavigation: IHomeNavigation): IHomeNavigation

    fun newSupportSubcomponent(): SupportSubComponent
}


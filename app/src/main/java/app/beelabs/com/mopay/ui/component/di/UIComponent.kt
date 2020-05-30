package app.beelabs.com.mopay.ui.component.di

import app.beelabs.com.codebase.di.component.AppComponent
import app.beelabs.com.mopay.ui.component.di.SupportSubComponent
import app.beelabs.com.mopay.ui.component.di.module.NavModule
import app.beelabs.com.mopay.ui.component.di.scope.UIScope
import com.demo.bee.ui.component.impl.IHomeNavigation
import app.beelabs.com.mopay.ui.component.di.impl.INavigation
import dagger.Component

@UIScope
@Component(modules = [NavModule::class], dependencies = [AppComponent::class])
interface UIComponent {
    fun inject(iNavigation: INavigation): INavigation
    fun inject(iHomeNavigation: IHomeNavigation): IHomeNavigation

    fun newSupportSubcomponent(): SupportSubComponent
}

package app.beelabs.com.mopay.ui.component.module

import app.beelabs.com.mopay.ui.component.impl.INavigation
import app.beelabs.com.mopay.ui.component.manager.NavigationManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NavModule {

    @Singleton
    @Provides
    fun provideNavigation(): INavigation {
        return NavigationManager()
    }


}
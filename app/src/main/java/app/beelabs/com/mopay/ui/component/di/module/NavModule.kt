package app.beelabs.com.mopay.ui.component.di.module

import app.beelabs.com.mopay.ui.component.di.impl.INavigation
import app.beelabs.com.mopay.ui.component.di.manager.NavigationManager
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
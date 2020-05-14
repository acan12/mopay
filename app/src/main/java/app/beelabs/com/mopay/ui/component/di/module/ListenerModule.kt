package app.beelabs.com.mopay.ui.component.di.module

import app.beelabs.com.mopay.ui.component.di.IListener
import app.beelabs.com.mopay.ui.component.di.manager.ListenerManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ListenerModule {

    @Singleton
    @Provides
    fun provideListener(): IListener {
        return ListenerManager()
    }


}
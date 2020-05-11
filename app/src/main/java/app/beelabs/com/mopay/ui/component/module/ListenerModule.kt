package app.beelabs.com.mopay.ui.component.module

import app.beelabs.com.mopay.ui.component.IListener
import app.beelabs.com.mopay.ui.component.manager.ListenerManager
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
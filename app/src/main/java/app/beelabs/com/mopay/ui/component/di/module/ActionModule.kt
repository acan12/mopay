package app.beelabs.com.mopay.ui.component.di.module

import app.beelabs.com.mopay.ui.component.di.IAction
import app.beelabs.com.mopay.ui.component.di.manager.ActionManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActionModule {

    @Singleton
    @Provides
    fun provideEvent(): IAction {
        return ActionManager()
    }


}
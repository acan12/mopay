package app.beelabs.com.mopay.ui.component.module

import app.beelabs.com.mopay.ui.component.IAction
import app.beelabs.com.mopay.ui.component.manager.ActionManager
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
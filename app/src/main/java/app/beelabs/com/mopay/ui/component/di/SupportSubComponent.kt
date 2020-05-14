package app.beelabs.com.mopay.ui.component.di

import app.beelabs.com.mopay.ui.component.di.IAction
import app.beelabs.com.mopay.ui.component.di.IListener
import app.beelabs.com.mopay.ui.component.di.ILogic
import app.beelabs.com.mopay.ui.component.di.module.ActionModule
import app.beelabs.com.mopay.ui.component.di.module.ListenerModule
import app.beelabs.com.mopay.ui.component.di.module.LogicUIModule
import app.beelabs.com.mopay.ui.component.di.scope.SupportScope
import dagger.Subcomponent

@SupportScope
@Subcomponent(modules = [LogicUIModule::class, ActionModule::class, ListenerModule::class])
interface SupportSubComponent {

    fun inject(logic: ILogic): ILogic
    fun inject(action: IAction): IAction
    fun inject(listener: IListener): IListener
}
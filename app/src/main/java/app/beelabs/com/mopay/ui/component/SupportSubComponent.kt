package app.beelabs.com.mopay.ui.component

import app.beelabs.com.mopay.ui.component.module.ActionModule
import app.beelabs.com.mopay.ui.component.module.ListenerModule
import app.beelabs.com.mopay.ui.component.module.LogicUIModule
import app.beelabs.com.mopay.ui.component.scope.SupportScope
import dagger.Subcomponent

@SupportScope
@Subcomponent(modules = [LogicUIModule::class, ActionModule::class, ListenerModule::class])
interface SupportSubComponent {

    fun inject(logic: ILogic): ILogic
    fun inject(action: IAction): IAction
    fun inject(listener: IListener): IListener
}
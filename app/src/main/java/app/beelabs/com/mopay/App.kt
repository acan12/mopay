package app.beelabs.com.mopay

import android.content.Context
import app.beelabs.com.codebase.base.BaseApp
import app.beelabs.com.codebase.di.component.AppComponent
import app.beelabs.com.codebase.di.component.DaggerAppComponent
import app.beelabs.com.mopay.ui.component.di.DaggerUIComponent
import app.beelabs.com.mopay.ui.component.di.IListener
import app.beelabs.com.mopay.ui.component.di.SupportSubComponent
import app.beelabs.com.mopay.ui.component.di.UIComponent
import app.beelabs.com.mopay.ui.component.di.impl.INavigation
import app.beelabs.com.mopay.ui.component.di.manager.ListenerManager
import app.beelabs.com.mopay.ui.component.di.manager.NavigationManager
import app.beelabs.com.mopay.ui.component.di.module.NavModule

class App : BaseApp() {

    companion object {
        var uiComponent: UIComponent? = null
        var supportSubComponent: SupportSubComponent? = null
        private var instance: App? = null

        fun applicationContext(): Context {
            return instance!!.applicationContext
        }


        fun getAppComponent(): AppComponent? {
            return getComponent()
        }

        fun getNavigationComponent(): INavigation {
            return uiComponent?.inject(NavigationManager())!!
        }

        fun getListener(): IListener? {
            return supportSubComponent?.inject(ListenerManager())
        }
    }

    override fun onCreate() {
        super.onCreate()
        setupBuilder(DaggerAppComponent.builder(), this)
        setupDefaultFont("font/SFProDisplay-Regular.ttf")

        uiComponent = DaggerUIComponent.builder().appComponent(getAppComponent())
            .navModule(NavModule()).build()

        supportSubComponent = DaggerUIComponent.builder().appComponent(getAppComponent()).build()
            .newSupportSubcomponent()

    }
}
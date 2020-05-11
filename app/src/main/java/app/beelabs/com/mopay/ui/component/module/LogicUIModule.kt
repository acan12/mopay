package app.beelabs.com.mopay.ui.component.module

import com.demo.bee.ui.component.impl.IAnimationLogic
import com.demo.bee.ui.component.impl.IPaymentLogic
import app.beelabs.com.mopay.ui.component.manager.AnimationLogicManager
import app.beelabs.com.mopay.ui.component.manager.PaymentLogicManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LogicUIModule {

    @Singleton
    @Provides
    fun providePaymentLogic(): IPaymentLogic {
        return PaymentLogicManager()
    }

    @Singleton
    @Provides
    fun provideAnimationLogic(): IAnimationLogic {
        return AnimationLogicManager()
    }
}
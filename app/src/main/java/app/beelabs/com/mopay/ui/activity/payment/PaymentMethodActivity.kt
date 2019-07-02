package app.beelabs.com.mopay.ui.activity.payment

import android.os.Bundle
import android.os.PersistableBundle
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.mopay.R

class PaymentMethodActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_payment_method)
    }
}
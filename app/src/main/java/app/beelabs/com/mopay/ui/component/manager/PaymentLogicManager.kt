package app.beelabs.com.mopay.ui.component.manager

import android.content.Context
import android.widget.Toast
import com.demo.bee.ui.component.impl.IPaymentLogic

class PaymentLogicManager : IPaymentLogic {

    override fun setupPayment(context: Context) {
        Toast.makeText(context, "Show Payment logic", Toast.LENGTH_SHORT).show()
    }
}
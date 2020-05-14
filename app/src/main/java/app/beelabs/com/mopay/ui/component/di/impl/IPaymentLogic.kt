package com.demo.bee.ui.component.impl

import android.content.Context
import app.beelabs.com.mopay.ui.component.di.ILogic

interface IPaymentLogic : ILogic {

    fun setupPayment(context: Context)
}
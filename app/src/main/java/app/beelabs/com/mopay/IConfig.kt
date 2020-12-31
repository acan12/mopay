package app.beelabs.com.mopay

interface IConfig {
    object APPCONFIG {
        val BASE_API_URL ="https://dodol.com"
        private const val PACKAGE_MERCHANT_FEATURE = "com.feature.merchant.ui.activity"
        const val MERCHANT_MODULE_CLASSNAME = "$PACKAGE_MERCHANT_FEATURE.MerchantHomeActivity"
    }



}
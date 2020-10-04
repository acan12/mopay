package app.beelabs.com.mopay.ui.activity

import android.content.Intent
import android.os.Bundle
import app.beelabs.com.mopay.BuildConfig
import app.beelabs.com.mopay.IConfig
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.ui.impl.IMainView
import com.google.android.play.core.splitinstall.SplitInstallManager
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest

class MainActivity : AppActivity(), IMainView {
    private val moduleMerchant by lazy { getString(R.string.merchant_feature_module) }
    private lateinit var manager: SplitInstallManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loadMerchantModule()
//        setContentView(R.layout.activity_main)
        setupLightStatusBarMode()
    
//        dataProduct.apply {
//            layoutManager = LinearLayoutManager(this@MainActivity)
//            adapter = ProductAdapter(ArrayList<Product>())
//        }
    }

    private fun loadMerchantModule() {
        manager = SplitInstallManagerFactory.create(this)
        val request = SplitInstallRequest.newBuilder()
            .addModule(moduleMerchant)
            .build()

        // Load and install the requested feature module.
        manager.startInstall(request)

        if (manager.installedModules.contains(moduleMerchant)) {
            onSuccessfulLoad(launch = true)
            return
        }
    }

    private fun onSuccessfulLoad(launch: Boolean) {
        if (launch) {
            launchActivity(IConfig.APPCONFIG.MODULE_MERCHANT_CLASSNAME)
        }
    }

    private fun launchActivity(className: String) {
        intent = Intent()
        intent.setClassName(BuildConfig.APPLICATION_ID, className)
            .also {
                it.putExtra("data", 5000)
                startActivity(it)
            }
    }
}




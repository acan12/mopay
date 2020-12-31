package app.beelabs.com.mopay.ui.activity.intro

import android.os.Bundle
import androidx.viewbinding.ViewBinding
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.mopay.databinding.ActivityAuthBinding

class AuthActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAuthBinding.inflate(layoutInflater)
        setupViewBinding(binding)
    }

    private fun setupViewBinding(binding: ViewBinding) {
        with(binding){

        }
    }
}
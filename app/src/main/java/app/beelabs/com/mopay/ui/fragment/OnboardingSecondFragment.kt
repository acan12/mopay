package app.beelabs.com.mopay.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.beelabs.com.codebase.base.BaseFragment
import app.beelabs.com.mopay.R

class OnboardingSecondFragment() : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(activity).inflate(R.layout.fragment_onboarding2, null, false)
    }

    override fun getRootView(): View {
        TODO("Not yet implemented")
    }
}
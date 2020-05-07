package app.beelabs.com.mopay.ui.activity.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import app.beelabs.com.mopay.R
import app.beelabs.com.mopay.ui.activity.AppActivity
import app.beelabs.com.mopay.ui.adapter.OnBoardingViewPagerAdapter
import app.beelabs.com.mopay.ui.fragment.OnboardingFirstFragment
import app.beelabs.com.mopay.ui.fragment.OnboardingSecondFragment
import app.beelabs.com.mopay.ui.fragment.OnboardingThirdFragment
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppActivity() {

    private var currentPage = 0
    private val fragments = ArrayList<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        setupLightStatusBarMode()

        val adapter = OnBoardingViewPagerAdapter(supportFragmentManager)

        fragments.add(OnboardingFirstFragment())
        fragments.add(OnboardingSecondFragment())
        fragments.add(OnboardingThirdFragment())

        adapter.addFragments(fragments)
        viewPager.adapter = adapter

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                currentPage = position
            }
        })

    }
}
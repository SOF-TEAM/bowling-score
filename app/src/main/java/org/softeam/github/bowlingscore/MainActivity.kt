package org.softeam.github.bowlingscore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.widget.Toolbar

import android.support.v4.view.ViewPager
import android.support.design.widget.TabLayout
import android.support.v4.app.FragmentPagerAdapter



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        //getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        //supportActionBar.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val viewPager = findViewById<ViewPager>(R.id.viewpager) //as ViewPager
        setupViewPager(viewPager)

        val tabLayout = findViewById<TabLayout>(R.id.tabs) //as TabLayout
        tabLayout.setupWithViewPager(viewPager)

    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(OneFragment(), "bowl now")
        adapter.addFragment(TwoFragment(), "edit names")
        adapter.addFragment(TreeFragment(), "team info")
        adapter.addFragment(FourFragment(), "choose graphics")
        adapter.addFragment(FiveFragment(), "games")
        viewPager.adapter = adapter
    }

    internal inner class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
        private val mFragmentList = ArrayList<Fragment>()
        private val mFragmentTitleList = ArrayList<String>()

        override fun getItem(position: Int): Fragment {
            return mFragmentList.get(position)
        }

        override fun getCount(): Int {
            return mFragmentList.size
        }

        fun addFragment(fragment: Fragment, title: String) {
            mFragmentList.add(fragment)
            mFragmentTitleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence {
            return mFragmentTitleList.get(position)
        }
    }

}

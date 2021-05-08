package com.neppplus.viewpagerpractice_genie.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpagerpractice_genie.fragments.GreetingsFragment
import com.neppplus.viewpagerpractice_genie.fragments.MyInfoFragment
import com.neppplus.viewpagerpractice_genie.fragments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when (position) {
            0 -> "이름"
            1 -> "내 정보"
            else -> "인사말"
        }

    }
    
    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> NameFragment()
            1 -> MyInfoFragment()
            else -> GreetingsFragment()
        }

    }

    override fun getCount(): Int {
        return 3
    }


}
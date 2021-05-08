package com.neppplus.viewpagerpractice_genie.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpagerpractice_genie.fragments.GreetingsFragment
import com.neppplus.viewpagerpractice_genie.fragments.MyInfoFragment
import com.neppplus.viewpagerpractice_genie.fragments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        if (position == 0) {
            return "이름"
        }
        else if (position == 1) {
            return "내 정보"
        }
        else {
            return "인사말"
        }
    }
    
    override fun getItem(position: Int): Fragment {

        if (position == 0) {
            return NameFragment()
        }
        else if (position == 1) {
            return MyInfoFragment()
        }
        else {
            return GreetingsFragment()
        }

    }

    override fun getCount(): Int {
        return 3
    }


}
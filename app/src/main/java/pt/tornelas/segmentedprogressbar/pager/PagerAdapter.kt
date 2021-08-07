package pt.tornelas.segmentedprogressbar.pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragmentActivity: FragmentActivity, private val items: List<Int>): FragmentStateAdapter(fragmentActivity) {


    override fun getItemCount(): Int = items.size

    override fun createFragment(position: Int): Fragment {
        return PageFragment()
    }
}
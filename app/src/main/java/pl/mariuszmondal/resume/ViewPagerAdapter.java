package pl.mariuszmondal.resume;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import pl.mariuszmondal.resume.Fragments.ContactFragment;
import pl.mariuszmondal.resume.Fragments.SkillsFragment;

/**
 * Created by Mondi on 11.04.2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{

    public static final int NR_OF_PAGES = 2;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ContactFragment.newInstance();
            case 1:
                return SkillsFragment.newInstance();


        }
        return null;
    }

    @Override
    public int getCount() {
        return NR_OF_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Kontakt";
            case 1:
                return "Umiejętności";
        }
        return super.getPageTitle(position);
    }
}

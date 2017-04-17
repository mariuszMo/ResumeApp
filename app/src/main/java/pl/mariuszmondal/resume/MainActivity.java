package pl.mariuszmondal.resume;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import pl.mariuszmondal.resume.Fragments.ContactFragment;

public class MainActivity extends AppCompatActivity {


    private FragmentManager mFragManager;

    @BindView(R.id.table_layout)
    TabLayout tableLayout;
    @BindView(R.id.view_pager)
    ViewPager viewPager;
    @BindView(R.id.toolbar_main)
    Toolbar toolbar;

    @BindView(R.id.drawer_layout_main)
    DrawerLayout drawerLayout;
    @BindView(R.id.navigation_view)
    NavigationView navigationView;


    @BindDrawable(R.drawable.contact_fragment_icon_name)
    Drawable contact_fragment_icon_name;
    @BindDrawable(R.drawable.contact_fragment_icon_telephone)
    Drawable contact_fragment_icon_telephone;
    @BindDrawable(R.drawable.contact_fragment_icon_mail)
    Drawable contact_fragment_icon_mail;
    @BindDrawable(R.drawable.contact_fragment_icon_www)
    Drawable contact_fragment_icon_www;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        final ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        tableLayout.setupWithViewPager(viewPager);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                toolbar.setTitle(item.getTitle());
                drawerLayout.closeDrawer(Gravity.START);
                int size = navigationView.getMenu().size();
                for (int i = 0; i < size; i++) {
                    MenuItem currentMenuItem = navigationView.getMenu().getItem(i);
                    if (currentMenuItem.isChecked()) currentMenuItem.setChecked(false);
                }
                item.setChecked(true);

                return false;
            }
        });
//sweepFragment();


    }

//
//    void sweepFragment() {
//
//        ContactFragment mContactFragment;
//        Fragment currentFragment;
////
////        switch (fragmentName){
////            case "ContactFragment": mContactFragment = ContactFragment.newInstance();
////                break;
////            default:mContactFragment = ContactFragment.newInstance();
////
////        }
//        mContactFragment = ContactFragment.newInstance();
//
//
//        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//
//        ft.replace(R.id.fragment_container, mContactFragment);
//        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//
//        ft.commit();
//    }




}

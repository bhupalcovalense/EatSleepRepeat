package com.hCueLite.Kiosk;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 3/13/2016.
 */
public class MyProfile extends BaseActivity{

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private View llmyprofile ;

    @Override
    public void initialize() {

        llmyprofile = getLayoutInflater().inflate(R.layout.myprofile, null, false);
        llBody.addView(llmyprofile);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#ffffff"));
        tabLayout.setSelectedTabIndicatorHeight(10);
        tabLayout.setTabTextColors(Color.parseColor("#DADADA"),Color.parseColor("#ffffff"));
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new PracticeFragment(), "PRACTICE");
        adapter.addFragment(new AboutFragment(), "ABOUT");
        adapter.addFragment(new OthersFragment(), "OTHERS");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    public class PracticeFragment extends Fragment
    {

        public PracticeFragment() {
            // Required empty public constructor
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View llfragment_day = inflater.inflate(R.layout.fragment_practice, container, false);
            ListView lv_day_calendar = (ListView) llfragment_day.findViewById(R.id.lv_day_calendar);
            PracticeAdapter practiceAdapter = new PracticeAdapter(MyProfile.this);
            lv_day_calendar.setAdapter(practiceAdapter);
            return llfragment_day;
        }
    }

    public class PracticeAdapter extends BaseAdapter
    {
        private Context context ;

        public PracticeAdapter(Context context) {
            this.context = context ;
        }

        @Override
        public int getCount() {
            return 30;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView =  LayoutInflater.from(context).inflate(R.layout.myprofile_practice_cell,parent,false);
            return convertView;
        }
    }

    public class AboutFragment extends Fragment
    {

        public AboutFragment() {
            // Required empty public constructor
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.myprofile_about, container, false);
        }
    }

    public class OthersFragment extends Fragment
    {

        public OthersFragment() {
            // Required empty public constructor
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.myprofile_others, container, false);
        }
    }
}

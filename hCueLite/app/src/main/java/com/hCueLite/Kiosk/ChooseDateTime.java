package com.hCueLite.Kiosk;

import android.app.Activity;
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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 3/13/2016.
 */
public class ChooseDateTime extends BaseActivity{

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private View llchoosedatetime ;

    @Override
    public void initialize() {

        llchoosedatetime = getLayoutInflater().inflate(R.layout.choose_date_time, null, false);
        llBody.addView(llchoosedatetime);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#359979"));
        tabLayout.setSelectedTabIndicatorHeight(10);
        tabLayout.setTabTextColors(Color.parseColor("#359979"),Color.parseColor("#000000"));

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new DayFragment(), "DAY");
        adapter.addFragment(new WeekFragment(), "WEEK");
        adapter.addFragment(new MonthFragment(), "MONTH");
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


    public class DayFragment extends Fragment
    {

        public DayFragment() {
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
            View llfragment_day = inflater.inflate(R.layout.fragment_day, container, false);
            ListView lv_day_calendar = (ListView) llfragment_day.findViewById(R.id.lv_day_calendar);
            DayAdapter dayAdapter = new DayAdapter(ChooseDateTime.this);
            lv_day_calendar.setAdapter(dayAdapter);
            return llfragment_day;
        }
    }

    public class DayAdapter extends BaseAdapter
    {
        private  Context context ;

        public DayAdapter(Context context) {
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
            convertView =  LayoutInflater.from(context).inflate(R.layout.day_cell,parent,false);
            return convertView;
        }
    }

    public class WeekFragment extends Fragment
    {

        public WeekFragment() {
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
            View llfragment_week = inflater.inflate(R.layout.calendar_week, container, false);

            TableLayout table_times = (TableLayout)llfragment_week.findViewById(R.id.table_times);
            TableLayout day1_times  = (TableLayout)llfragment_week.findViewById(R.id.day1_times);
            TableLayout day2_times  = (TableLayout)llfragment_week.findViewById(R.id.day2_times);
            TableLayout day3_times  = (TableLayout)llfragment_week.findViewById(R.id.day3_times);
            TableLayout day4_times  = (TableLayout)llfragment_week.findViewById(R.id.day4_times);
            TableLayout day5_times  = (TableLayout)llfragment_week.findViewById(R.id.day5_times);
            TableLayout day6_times  = (TableLayout)llfragment_week.findViewById(R.id.day6_times);
            TableLayout day7_times  = (TableLayout)llfragment_week.findViewById(R.id.day7_times);
            for (int i=0;i<30;i++)
            {
                View view = LayoutInflater.from(ChooseDateTime.this).inflate(R.layout.time_cell,null);
                table_times.addView(view);
            }
            for (int i=0;i<30;i++)
            {
                View view = LayoutInflater.from(ChooseDateTime.this).inflate(R.layout.week_cell,null);
                day1_times.addView(view);
               /* day2_times.addView(view);
                day3_times.addView(view);
                day4_times.addView(view);
                day5_times.addView(view);
                day6_times.addView(view);
                day7_times.addView(view);*/
            }
            return llfragment_week;
        }
    }

    public class MonthFragment extends Fragment
    {

        public MonthFragment() {
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
            return inflater.inflate(R.layout.fragment_month, container, false);
        }
    }
}

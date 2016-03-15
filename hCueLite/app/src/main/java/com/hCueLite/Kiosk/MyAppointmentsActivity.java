package com.hCueLite.Kiosk;

import android.annotation.SuppressLint;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hCueLite.Kiosk.Fragments.FutureAppointmentsFragment;
import com.hCueLite.Kiosk.Fragments.PastAppointmentsFragment;
import com.hCueLite.Kiosk.Fragments.TodaysAppointmentsFragment;

@SuppressLint("NewApi")
public class MyAppointmentsActivity extends FragmentActivity implements TabListener, View.OnClickListener {
	private ViewPager viewPager;
	private TabPagerAdapter tabPagerAdapter;
	private LinearLayout llPastTab, llTodayTab, llFutureTab;
	private TextView tvPastTab, tvTodayTab, tvFutureTab, tvPastTabLine, tvTodayTabLIne, tvFutureTabLine;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_appointments);

		initializeControls();

		viewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int postion) {
				clearTabViews();
				if(postion == 0){
					tvPastTab.setTextColor(Color.parseColor("#41B09E"));
					tvPastTabLine.setVisibility(View.VISIBLE);
				}else if(postion == 1){
					tvTodayTab.setTextColor(Color.parseColor("#41B09E"));
					tvTodayTabLIne.setVisibility(View.VISIBLE);
				}else{
					tvFutureTab.setTextColor(Color.parseColor("#41B09E"));
					tvFutureTabLine.setVisibility(View.VISIBLE);
				}
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {

			}
		});
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClick(View v) {
		clearTabViews();
		switch(v.getId()){

			case R.id.llPastTab:
				viewPager.setCurrentItem(0);
				tvPastTab.setTextColor(Color.parseColor("#41B09E"));
				tvPastTabLine.setVisibility(View.VISIBLE);
				break;
			case R.id.llTodayTab:
				viewPager.setCurrentItem(1);
				tvTodayTab.setTextColor(Color.parseColor("#41B09E"));
				tvTodayTabLIne.setVisibility(View.VISIBLE);
				break;
			case R.id.llFutureTab:
				viewPager.setCurrentItem(2);
				tvFutureTab.setTextColor(Color.parseColor("#41B09E"));
				tvFutureTabLine.setVisibility(View.VISIBLE);
				break;

		}
	}

	public void initializeControls(){
		llPastTab = (LinearLayout)findViewById(R.id.llPastTab);
		llTodayTab = (LinearLayout)findViewById(R.id.llTodayTab);
		llFutureTab = (LinearLayout)findViewById(R.id.llFutureTab);

		tvPastTab = (TextView)findViewById(R.id.tvPastTab);
		tvTodayTab = (TextView)findViewById(R.id.tvTodayTab);
		tvFutureTab = (TextView)findViewById(R.id.tvFutureTab);

		tvPastTabLine = (TextView)findViewById(R.id.tvPastTabLine);
		tvTodayTabLIne = (TextView)findViewById(R.id.tvTodayTabLIne);
		tvFutureTabLine = (TextView)findViewById(R.id.tvFutureTabLine);

		viewPager = (ViewPager) findViewById(R.id.viewPager);
		tabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());
		viewPager.setAdapter(tabPagerAdapter);

		llPastTab.setOnClickListener(this);
		llTodayTab.setOnClickListener(this);
		llFutureTab.setOnClickListener(this);
	}

	public void clearTabViews(){
		tvPastTab.setTextColor(Color.parseColor("#AFAFAF"));
		tvTodayTab.setTextColor(Color.parseColor("#AFAFAF"));
		tvFutureTab.setTextColor(Color.parseColor("#AFAFAF"));

		tvPastTabLine.setVisibility(View.INVISIBLE);
		tvTodayTabLIne.setVisibility(View.INVISIBLE);
		tvFutureTabLine.setVisibility(View.INVISIBLE);
	}

	public class TabPagerAdapter extends FragmentPagerAdapter {

		public TabPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int arg0) {
			switch (arg0) {
				case 0:
					return new PastAppointmentsFragment(MyAppointmentsActivity.this);
				case 1:
					return new TodaysAppointmentsFragment();
				case 2:
					return new FutureAppointmentsFragment();
				default:
					break;
			}
			return null;
		}

		@Override
		public int getCount() {
			return 3;
		}

	}
}

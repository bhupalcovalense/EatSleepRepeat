package com.hCueLite.Kiosk.Fragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.hCueLite.Kiosk.R;

import java.util.Vector;

public class PastAppointmentsFragment extends Fragment{

	public ListView lvPastAppointments;
	private Vector<String> vecPastAppoinments = new Vector<>();
	Context mContext;
	public PastAppointmentsAdapter pastAppointmentAdapter;

	public PastAppointmentsFragment(){

	}

	public PastAppointmentsFragment(Context context){
		this.mContext = context;
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		loadDummyData();

		View v = inflater.inflate(R.layout.past_appointment_fragment, container, false);
		lvPastAppointments = (ListView)v.findViewById(R.id.lvPastAppointments);
		pastAppointmentAdapter = new PastAppointmentsAdapter();
		lvPastAppointments.setAdapter(pastAppointmentAdapter);

		return v;
	}

	public  class PastAppointmentsAdapter extends BaseAdapter {

		@Override
		public int getCount() {

			return 10;
//			return vecPastAppoinments.size();
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			ViewHolder viewHolder;
			if( convertView == null ){
				//We must create a View:
				convertView = LayoutInflater.from(mContext).inflate(R.layout.choose_patient_list_cell, parent, false);
				viewHolder = new ViewHolder();
				convertView.setTag(viewHolder);
			}else{
				viewHolder = (ViewHolder) convertView.getTag();
			}
			return convertView;
		}

		@Override
		public Object getItem(int position) {
			return vecPastAppoinments.get(position);
		}

		@Override
		public long getItemId(int position) {
			return 0;
		}
	}
	public static class ViewHolder {
		RecyclerView recyclerView;
	}

	private void loadDummyData(){

	}
}

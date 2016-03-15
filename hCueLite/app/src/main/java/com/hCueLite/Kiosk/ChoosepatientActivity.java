package com.hCueLite.Kiosk;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.Vector;

/**
 * Created by CVLHYD-161 on 12-03-2016.
 */
public class ChoosepatientActivity extends  BaseActivity{

    ChoosePatientsAdapter choosePatientsAdapter;
    private ListView lvChoosePatient;
    private Vector<String> vecPatients = new Vector<>();
    @Override
    public void initialize() {
        super.initialize();

        View inflatedLayout = getLayoutInflater().inflate(R.layout.choosepatient, null, false);

        lvChoosePatient = (ListView)inflatedLayout.findViewById(R.id.lvChoosePatient);
        choosePatientsAdapter = new ChoosePatientsAdapter();
        lvChoosePatient.setAdapter(choosePatientsAdapter);

        llBody.addView(inflatedLayout);
    }

    public  class ChoosePatientsAdapter extends BaseAdapter {

        @Override
        public int getCount() {

            return 2;
//			return vecPastAppoinments.size();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder viewHolder;
            if( convertView == null ){
                //We must create a View:
                convertView = LayoutInflater.from(ChoosepatientActivity.this).inflate(R.layout.choose_patient_list_cell, parent, false);
                viewHolder = new ViewHolder();
                convertView.setTag(viewHolder);
            }else{
                viewHolder = (ViewHolder) convertView.getTag();
            }
            return convertView;
        }

        @Override
        public Object getItem(int position) {
            return vecPatients.get(position);
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

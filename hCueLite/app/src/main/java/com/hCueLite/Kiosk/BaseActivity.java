package com.hCueLite.Kiosk;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.hCueLite.Kiosk.Model.DrawerCategory;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseActivity extends FragmentActivity {

    private DrawerLayout mDrawerLayout;
    private ListView lvDrawerItems;
    ArrayList<DrawerCategory> listDrawerItems = null;
    private TextView tvDoctorName, tvClinicName;
    private FrameLayout flClinic1,flClinic2;
    private ImageView ivProfilePic, ivDownArrow, ivMenu ;
    public LinearLayout llBody;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base);
        loadDrawerData();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        lvDrawerItems = (ListView)findViewById(R.id.lvDrawerItems);
        llBody = (LinearLayout) findViewById(R.id.llBody);
        ivMenu = (ImageView) findViewById(R.id.ivMenu);

        DrawerItemsAdapter adapterCategories = new DrawerItemsAdapter(BaseActivity.this, listDrawerItems);
        lvDrawerItems.setAdapter(adapterCategories);

        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
                    mDrawerLayout.closeDrawer(Gravity.LEFT);
                } else {
                    mDrawerLayout.openDrawer(Gravity.LEFT);
                }
            }
        });
        initialize();

        lvDrawerItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent in = new Intent(BaseActivity.this, QuickBookActivity.class);
                        startActivity(in);
                        break;
                    case 1:
                        Intent in1 = new Intent(BaseActivity.this, MyAppointmentsActivity.class);
                        startActivity(in1);
                        break;
                    case 2:
                        Intent in2 = new Intent(BaseActivity.this, ChooseDateTime.class);
                        startActivity(in2);
                        break;
                    case 3:
                        Intent in3 = new Intent(BaseActivity.this, MyProfile.class);
                        startActivity(in3);
                        break;
                    case 4:
                        Intent in4 = new Intent(BaseActivity.this, SettingsActivity.class);
                        startActivity(in4);
                        break;
                    case 5:
                        Intent in5 = new Intent(BaseActivity.this, Help.class);
                        startActivity(in5);
                        break;
                    case 6:
                        Intent in6 = new Intent(BaseActivity.this, Help.class);
                        startActivity(in6);

                        break;
                }
            }
        });
    }

    public void initialize(){

    }

    public class DrawerItemsAdapter extends BaseAdapter {
        private Context mContext;
        private List<DrawerCategory> drawerItemsList;
        private LayoutInflater inflater;

        public DrawerItemsAdapter(Context context, List<DrawerCategory> drawerItemsList) {
            mContext = context;
            this.drawerItemsList = drawerItemsList;
            inflater = LayoutInflater.from(this.mContext);
        }

        @Override
        public int getCount() {
            return drawerItemsList.size();
        }

        @Override
        public Object getItem(int position) {
            return drawerItemsList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            ViewHolder viewHolder;
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.drawer_list_cell, null);
                viewHolder = new ViewHolder();
                viewHolder.tvDrawerOperation = (TextView) convertView.findViewById(R.id.tvDrawerOperation);
                viewHolder.ivDrawerOperation = (ImageView) convertView.findViewById(R.id.ivDrawerOperation);
                viewHolder.tvCount           = (TextView) convertView.findViewById(R.id.tvCount);
                convertView.setTag(viewHolder);

            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }

            if (position == 1){
                viewHolder.tvCount.setVisibility(View.VISIBLE);
            }else
                viewHolder.tvCount.setVisibility(View.INVISIBLE);
            viewHolder.tvDrawerOperation.setText(listDrawerItems.get(position).CategoryOperation);
            viewHolder.ivDrawerOperation.setBackgroundResource(listDrawerItems.get(position).categoryImage);
            return convertView;
        }

        public class ViewHolder {
            TextView tvDrawerOperation, tvCount;
            ImageView ivDrawerOperation;
        }
    }
    public void loadDrawerData(){
        listDrawerItems = new ArrayList<>();

        DrawerCategory category1 = new DrawerCategory();
        category1.CategoryOperation = "QUICK BOOK";
        category1.categoryImage = R.drawable.quickbook_icon_menu;
        listDrawerItems.add(category1);

        DrawerCategory category2 = new DrawerCategory();
        category2.CategoryOperation = "MY APPOINTMENTS";
        category2.categoryImage = R.drawable.appointment_icon_menu;
        listDrawerItems.add(category2);

        DrawerCategory category3 = new DrawerCategory();
        category3.CategoryOperation = "MY CALENDER";
        category3.categoryImage = R.drawable.calendar_icon_menu;
        listDrawerItems.add(category3);


        DrawerCategory category4 = new DrawerCategory();
        category4.CategoryOperation = "My PROFILE";
        category4.categoryImage = R.drawable.myprofile_icon_menu;
        listDrawerItems.add(category4);

        DrawerCategory category5 = new DrawerCategory();
        category5.CategoryOperation = "SETTINGS";
        category5.categoryImage = R.drawable.setting_icon_menu;
        listDrawerItems.add(category5);

        DrawerCategory category6 = new DrawerCategory();
        category6.CategoryOperation = "HELP";
        category6.categoryImage = R.drawable.help_icon_menu;
        listDrawerItems.add(category6);

        DrawerCategory category7 = new DrawerCategory();
        category7.CategoryOperation = "LOGOUT";
        category7.categoryImage = R.drawable.logout_icon_menu;
        listDrawerItems.add(category7);
    }
}
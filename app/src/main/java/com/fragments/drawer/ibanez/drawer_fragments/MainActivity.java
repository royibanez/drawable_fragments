package com.fragments.drawer.ibanez.drawer_fragments;

import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends Fragment
        implements NavigationView.OnNavigationItemSelectedListener {


    DrawerLayout mDrawerLayout;
    ListView mDrawerList;
    ActionBarDrawerToggle mDrawerToggle;
    MenuListAdapter mMenuAdapter;
    String[] title;
    String[] subtitle;
    int[] icon;
    Fragment fragment1 = new StartFragment();
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;

    private picker_fragment PickerDemo = new picker_fragment();
    private textile_fragment TextFieldDemo = new textile_fragment();
    private toggle_fragment ToggleDemo = new toggle_fragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTitle = mDrawerTitle = getTitle();

        title = getResources().getStringArray(R.array.actionbar_menu);

        icon = new int[] { R.drawable.home, R.drawable.mozart,
                R.drawable.action_settings, R.drawable.action_settings,
                R.drawable.action_settings, R.drawable.collections_cloud };

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);


        if(savedInstanceState == null)
        {
            getFragmentManager().beginTransaction().add(R.id.container,new PHFragment()).commit();
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {

            getMenuInflater().inflate(R.menu.main, onCreateOptionsMenunu);
            return true;
        }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (id){
            case R.id.picker_fragment:
                transaction.replace(R.id.fragment_container, PickerDemo);
                transaction.commit();
                break;
            case R.id.textfield_fragment:
                transaction.replace(R.id.fragment_container, TextFieldDemo);
                transaction.commit();
                break;
            case R.id.toggle_fragment:
                transaction.replace(R.id.fragment_container, ToggleDemo);
                transaction.commit();
                break;
        }

    }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

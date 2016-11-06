package dbatu.techfest.org.cynosure16;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ViewPager pager;
    private SlidingTabLayout slidingTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        pager = (ViewPager) findViewById(R.id.pager);
        slidingTabs = (SlidingTabLayout) findViewById(R.id.tabs);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        slidingTabs.setViewPager(pager);
        slidingTabs.setDistributeEvenly(true);
        slidingTabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.textIcon);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.team) {
            Toast.makeText(MainActivity.this, "Team Cynosure", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(MainActivity.this,TeamActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*public static class MyFragment extends Fragment {

        public static MyFragment getInstance(int position) {
            MyFragment fragment = new MyFragment();
            Bundle args = new Bundle();
            args.putInt("position", position);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.home, container, false);

            return view;
        }
    }*/

    class MyPagerAdapter extends FragmentPagerAdapter {
        String[] tabs;

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
            tabs = getResources().getStringArray(R.array.tabs);
        }

        @Override
        public Fragment getItem(int position) {

            if(position == 0)
            {
                Home home = new Home();
                return home;
            }
            else if (position==1)
            {
                Events events = new Events();
                return events;
            }
            else if (position==2)
            {
                Workshops workshops = new Workshops();
                return workshops;
            }
            else if (position==3)
            {
                Sponsors sponsors = new Sponsors();
                return sponsors;
            }
            else
            {
                return null;
            }
            /*MyFragment fragment = MyFragment.getInstance(position);

            return fragment;*/
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];
        }
    }

    public void linkToRadioCity (View v)
    {
        goToUrl ("http://www.planetradiocity.com/");
    }

    public void fb (View v)
    {
        goToUrl ("http://www.facebook.com/dbatu.cynosure");
    }

    public void utube (View v)
    {
        goToUrl ("https://www.youtube.com/channel/UCf5e4rWsixKlGqc1oSJps6Q");
    }

    public void insta (View v)
    {
        goToUrl ("http://www.instagram.com/cynosure_2k16");
    }

    public void twitter (View v)
    {
        goToUrl ("http://www.twitter.com/dbatu_cynosure");
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


}

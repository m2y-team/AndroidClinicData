package m2y.centennial.healthowl.appointment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import m2y.centennial.healthowl.R;

public class AppointmentTabs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment_tabs);


        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager_app);
        viewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager(),
                AppointmentTabs.this));

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs_app);
        tabLayout.setupWithViewPager(viewPager);
    }
}
package m2y.centennial.healthowl.appointment;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

import m2y.centennial.healthowl.R;

public class MainAppointments extends AppCompatActivity {

    ListView lv;
    Context context;
    ArrayList prgmName;
    public static String[] appointment_names = new String[]{"Cross, Clara","Abot, Anna","Jo, Joe"};
    //public static String[] appointment_date = new String[]{"2016-11-04, 9:30 am", "2016-11-04, 11:30 am", "2016-11-04, 2:30 pm"};
    public static String[] appointment_desc = new String[]{"Regular checkup", "Blood pressure", "Heart Problem"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_appointments);

        context=this;
        lv=(ListView) findViewById(R.id.listView2);
        lv.setAdapter(new CustomListViewAdapter(this, appointment_names,appointment_desc));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_appointment_tabs, menu);
        return true;
    }


}

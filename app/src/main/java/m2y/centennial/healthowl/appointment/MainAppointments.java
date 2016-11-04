package m2y.centennial.healthowl.appointment;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

import m2y.centennial.healthowl.R;
import m2y.centennial.healthowl.patient.patientMain;

public class MainAppointments extends AppCompatActivity {


   // myDetailsToolbar.setTitle("My title");

    ListView lv;
    Context context;

    ArrayList prgmName;
    ImageButton appAppointment;
    public static String[] appointment_names = new String[]{"Cross, Clara","Abot, Anna","Jo, Joe","xyz","tye"};
    //public static String[] appointment_date = new String[]{"2016-11-04, 9:30 am", "2016-11-04, 11:30 am", "2016-11-04, 2:30 pm"};
    public static String[] appointment_desc = new String[]{"Regular checkup", "Blood pressure", "Heart Problem","asdhj","sadhja"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_appointments);

        Toolbar myAppointmentToolbar = (Toolbar)findViewById(R.id.my_appointment_toolbar);
        setSupportActionBar(myAppointmentToolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("Appointments");

        context=this;
        lv=(ListView) findViewById(R.id.listView2);
        lv.setAdapter(new CustomListViewAdapter(this, appointment_names,appointment_desc));


        appAppointment = (ImageButton) findViewById(R.id.addAppointment);



        appAppointment.setOnClickListener(new View.OnClickListener() {
            String test = "appointment";
            public void onClick(View v) {
                Intent intent = new Intent(context, addAppointment.class);
                intent.putExtra("AddAppointment",test);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_appointment_tabs, menu);
        return true;
    }



}

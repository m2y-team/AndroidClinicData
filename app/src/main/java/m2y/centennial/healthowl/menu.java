package m2y.centennial.healthowl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import m2y.centennial.healthowl.Patient.patientList;
import m2y.centennial.healthowl.appointment.MainAppointments;
import m2y.centennial.healthowl.groups.GroupMainActivity;
import m2y.centennial.healthowl.test.TestMainActivity;


public class menu extends AppCompatActivity {

    private Button mPatient;
    private Button mAppointment;
    private Button mTest;
    private Button mGroups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mPatient = (Button) findViewById(R.id.patientsButton);
        mPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testChoice = "test";
                goPatientList(testChoice);

            }
        });

        mAppointment = (Button) findViewById(R.id.appointmentsButton);
        mAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testChoice = "test";
                goAppointment(testChoice);

            }
        });

        mTest = (Button) findViewById(R.id.testsButton);
        mTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testChoice = "test";
                goTest(testChoice);

            }
        });

        mGroups = (Button) findViewById(R.id.GroupsButton);
        mGroups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testChoice = "test";
                goGroups(testChoice);

            }
        });

    }

    private void goPatientList(String testChoice){
        Intent intent = new Intent(this, patientList.class);
        intent.putExtra("testChoice", testChoice);
        startActivity(intent);
    }

    private void goAppointment(String testChoice){
        Intent intent = new Intent(this, MainAppointments.class);
        intent.putExtra("testChoice", testChoice);
        startActivity(intent);
    }

    private void goTest(String testChoice){
        Intent intent = new Intent(this, TestMainActivity.class);
        intent.putExtra("testChoice", testChoice);
        startActivity(intent);
    }

    private void goGroups(String testChoice){
        Intent intent = new Intent(this, GroupMainActivity.class);
        intent.putExtra("testChoice", testChoice);
        startActivity(intent);
    }
}

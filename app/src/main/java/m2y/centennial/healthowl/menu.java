package m2y.centennial.healthowl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class menu extends AppCompatActivity {

    private Button mPatient;

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

    }

    private void goPatientList(String testChoice){
        Intent intent = new Intent(this, patientMain.class);
        intent.putExtra("testChoice", testChoice);
        startActivity(intent);
    }

}

package m2y.centennial.healthowl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class patientList extends AppCompatActivity {

    private Button mLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_list);



        //Set up Menu with back button
        Toolbar myDetailsToolbar = (Toolbar)findViewById(R.id.my_Detail_toolbar);
        setSupportActionBar(myDetailsToolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mLink = (Button) findViewById(R.id.toPatientLink);
        mLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testChoice = "test";
                goNext(testChoice);

            }
        });
    }

    private void goNext(String testChoice){
        Intent intent = new Intent(this, patientMain.class);
        intent.putExtra("testChoice", testChoice);
        startActivity(intent);
    }
}

package com.example.cantri.layoutdoctoronline;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by cantri on 27/04/2017.
 */

public class ClinicDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clinic_detail);
        final Intent intent = getIntent();
        Clinic clinic = intent.getParcelableExtra("detail");
        TextView name = (TextView) findViewById(R.id.clinic_name_detail);
        name.setText(clinic.getName());
        Button listDoctor = (Button) findViewById(R.id.list_doctor);
        listDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),ListDoctorActivity.class);
                startActivity(intent1);
            }
        });
    }
}

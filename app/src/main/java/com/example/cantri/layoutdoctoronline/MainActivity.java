package com.example.cantri.layoutdoctoronline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private List<Clinic> clinicList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ClinicAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.listClinic);

        mAdapter = new ClinicAdapter(clinicList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Clinic clinic = clinicList.get(position);
                Intent intent = new Intent(view.getContext(), ClinicDetailActivity.class);
                intent.putExtra("detail", clinic);
                startActivity(intent);

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        recyclerView.setAdapter(mAdapter);

        prepareClinicData();
    }

    private void prepareClinicData() {
        Clinic clinic = new Clinic("123", "abc", "xyz", "trh", "glh");
        clinicList.add(clinic);
        clinic = new Clinic("123", "abc", "xyz", "trh", "glh");
        clinicList.add(clinic);
        clinic = new Clinic("123", "abc", "xyz", "trh", "glh");
        clinicList.add(clinic);
        clinic = new Clinic("123", "abc", "xyz", "trh", "glh");
        clinicList.add(clinic);
        clinic = new Clinic("123", "abc", "xyz", "trh", "glh");
        clinicList.add(clinic);
        clinic = new Clinic("123", "abc", "xyz", "trh", "glh");
        clinicList.add(clinic);
        clinic = new Clinic("123", "abc", "xyz", "trh", "glh");
        clinicList.add(clinic);
        mAdapter.notifyDataSetChanged();
    }
}

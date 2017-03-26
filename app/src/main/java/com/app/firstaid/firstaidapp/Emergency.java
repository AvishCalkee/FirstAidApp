package com.app.firstaid.firstaidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Emergency extends AppCompatActivity {
    private List<Disease> diseaseList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DiseaseAdapter DAdapter;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        DAdapter = new DiseaseAdapter(diseaseList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(DAdapter);

        prepareEmergencyData();
    }

    public void prepareEmergencyData(){

        Disease disease = new Disease("Chest Pain");
        diseaseList.add(disease);

        disease = new Disease("Accident");
        diseaseList.add(disease);

        disease = new Disease("Stomatch Pain");
        diseaseList.add(disease);

        disease = new Disease("Dizziness");
        diseaseList.add(disease);

        disease = new Disease("Fire");
        diseaseList.add(disease);

        disease = new Disease("Flood");
        diseaseList.add(disease);

        disease = new Disease("Up");
        diseaseList.add(disease);

        disease = new Disease("Others");
        diseaseList.add(disease);


        DAdapter.notifyDataSetChanged();


    }
}

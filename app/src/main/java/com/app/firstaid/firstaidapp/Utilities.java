package com.app.firstaid.firstaidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Utilities extends AppCompatActivity {
    private List<Utility> utilitiesList = new ArrayList<>();
    private RecyclerView recyclerView;
    private UtilityRowAdapter UAdapter;

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utilities);

        toolbar=(Toolbar)findViewById(R.id.toolbar_utility);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_utility);

        UAdapter = new UtilityRowAdapter(DummyData.getData());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(UAdapter);

       // prepareUtilityData();
    }

    public void prepareUtilityData(){

        Utility utility = new Utility("Food");
        utilitiesList.add(utility);

        utility = new Utility("Gas");
        utilitiesList.add(utility);

        utility = new Utility("Medicines");
        utilitiesList.add(utility);

        utility = new Utility("Transportation");
        utilitiesList.add(utility);

        utility = new Utility("Mobile Recharge");
        utilitiesList.add(utility);

        utility = new Utility("Others");
        utilitiesList.add(utility);

        utility =new Utility("Food");
        utilitiesList.add(utility);

        utility = new Utility("Gas");
        utilitiesList.add(utility);


        UAdapter.notifyDataSetChanged();


    }
    }



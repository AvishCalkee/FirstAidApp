package com.app.firstaid.firstaidapp;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Avish on 20/02/2017.
 */

public class DiseaseAdapter extends RecyclerView.Adapter<DiseaseAdapter.MyViewHolder>  {

    private List<Disease> diseaseList;


    // private final View.OnClickListener mOnClickListener = new MyOnClickListener();

    public class MyViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        public TextView name;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.txtDiseaseName);
           view.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Disease disease=diseaseList.get(getAdapterPosition());
            //Toast.makeText(v.getContext(),"Test"+disease.getName(),Toast.LENGTH_SHORT).show();
            Intent startMap= new Intent(v.getContext(),MapsActivity.class);
           v.getContext().startActivity(startMap);
        }
    }

    public DiseaseAdapter(List<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.emergency_list_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Disease disease = diseaseList.get(position);
        holder.name.setText(disease.getName());
    }

    @Override
    public int getItemCount() {
        return diseaseList.size();
    }
}

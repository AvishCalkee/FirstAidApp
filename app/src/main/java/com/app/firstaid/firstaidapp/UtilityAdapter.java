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
 * Created by Avish on 22/02/2017.
 */

public class UtilityAdapter  extends RecyclerView.Adapter<UtilityAdapter.MyViewHolder>  {

    private List<Utility> utilitiesList;


    // private final View.OnClickListener mOnClickListener = new MyOnClickListener();

    public class MyViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        public TextView task,orderBy,date;

        public MyViewHolder(View view) {
            super(view);
            task = (TextView) view.findViewById(R.id.txtTask);
            view.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            Utility utility=utilitiesList.get(getAdapterPosition());
            Toast.makeText(v.getContext(),"Test"+utility.getTask(),Toast.LENGTH_SHORT).show();
            Intent startMap= new Intent(v.getContext(),MapsActivity.class);
            v.getContext().startActivity(startMap);
        }
    }

    public UtilityAdapter(List<Utility>  utilitiesList) {
        this.utilitiesList = utilitiesList;
    }

    @Override
    public UtilityAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.utilities_layout, parent, false);

        return new UtilityAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UtilityAdapter.MyViewHolder holder, int position) {
        Utility utility = utilitiesList.get(position);
        holder.task.setText(utility.getTask());

    }

    @Override
    public int getItemCount() {
        return utilitiesList.size();
    }
}

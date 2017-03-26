package com.app.firstaid.firstaidapp;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Avish on 01/03/2017.
 */

public class UtilityRowAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Utility> mList;
    public static String open="true";
  LinkedList<Integer> lastPosition= new LinkedList<Integer>();
    public UtilityRowAdapter(List<Utility> list) {
        this.mList = list;
    }
    public UtilityRowAdapter(){

    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case Utility.FOOD_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.utilities_layout, parent, false);
                return new FoodViewHolder(view);
            case Utility.TRANSPORTATION_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.utilities_layout_transport, parent, false);
                return new TransportationViewHolder(view);
        }
        return null;
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
     Utility object = mList.get(position);
        if (object != null) {
            switch (object.getType()) {
                case Utility.FOOD_TYPE:
                    ((FoodViewHolder) holder).mTitle.setText(object.getTask());
                    break;
                case Utility.TRANSPORTATION_TYPE:
                    ((TransportationViewHolder) holder).mTitle.setText(object.getTask());

                    break;
            }
        }
    }
    @Override
    public int getItemCount() {
        if (mList == null)
            return 0;
        return mList.size();
    }
    @Override
    public int getItemViewType(int position) {
        if (mList != null) {
            Utility object = mList.get(position);
            if (object != null) {
                return object.getType();
            }
        }
        return 0;
    }
    public static class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mTitle;
        private LinearLayout foodLinearLayout;
        public FoodViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.txtTask);
            foodLinearLayout=(LinearLayout) itemView.findViewById(R.id.linearTransportation);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            foodLinearLayout.setVisibility(View.VISIBLE);

        }
    }
    public  class TransportationViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mTitle;
        private LinearLayout foodLinearLayout;
        public TransportationViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.txtTask);
            foodLinearLayout=(LinearLayout) itemView.findViewById(R.id.linearTransportation);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
         /*   foodLinearLayout.setVisibility(View.VISIBLE);
            Log.d("Position","Position"+getAdapterPosition());
            int pos=getAdapterPosition();
            notifyItemChanged(pos);
          foodLinearLayout.setVisibility(View.GONE);*/

            if(lastPosition.size()==0){
                foodLinearLayout.setVisibility(View.VISIBLE);
                lastPosition.add(getAdapterPosition());
                Log.d("excution","first");
            }

            else if(lastPosition.size()>0 && lastPosition.get(0)!=getAdapterPosition()){

                if(foodLinearLayout.getVisibility()==View.VISIBLE){
                    foodLinearLayout.setVisibility(View.GONE);
                    lastPosition.clear();
                    lastPosition.add(getAdapterPosition());
                    Log.d("excution", "sec");
                    open="false";

                }

                else {
                    foodLinearLayout.setVisibility(View.VISIBLE);
                    lastPosition.clear();
                    lastPosition.add(getAdapterPosition());
                    Log.d("excution", "sec");
                    open = "true";
                }
            }

            else if (lastPosition.size()>0 && lastPosition.get(0)==getAdapterPosition()){
                if(open.equals("true")) {
                    foodLinearLayout.setVisibility(View.GONE);
                    lastPosition.clear();
                    lastPosition.add(getAdapterPosition());
                    Log.d("excution", "third");
                    open="falses";
                }
                else{
                    foodLinearLayout.setVisibility(View.VISIBLE);
                    lastPosition.clear();
                    lastPosition.add(getAdapterPosition());
                    Log.d("excution", "fourth");
                    open="true";

                }
            }

        }
    }



}


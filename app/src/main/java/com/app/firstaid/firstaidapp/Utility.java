package com.app.firstaid.firstaidapp;

/**
 * Created by Avish on 22/02/2017.
 */

public class Utility {

    private String task;
    private String orderBy;
    private String date;



    private int type;


    public static final int FOOD_TYPE = 0;
    public static final int TRANSPORTATION_TYPE = 1;


    public Utility(){

    }

    public Utility(String task){
        this.task=task;
    }

    public Utility(String task,int type){
        this.task=task;
        this.type=type;
    }


    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


}

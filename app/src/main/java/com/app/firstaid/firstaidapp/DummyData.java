package com.app.firstaid.firstaidapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Avish on 01/03/2017.
 */

public class DummyData {

    public static List<Utility> getData() {
        List<Utility> list = new ArrayList<>();
        list.add(new Utility("Food",Utility.FOOD_TYPE));
        list.add(new Utility("Transportation",Utility.TRANSPORTATION_TYPE));
        list.add(new Utility("Food",Utility.FOOD_TYPE));
        list.add(new Utility("Transportation",Utility.TRANSPORTATION_TYPE));
        list.add(new Utility("Food",Utility.FOOD_TYPE));
        list.add(new Utility("Transportation",Utility.TRANSPORTATION_TYPE));
        list.add(new Utility("Food",Utility.FOOD_TYPE));
        return list;
    }


}

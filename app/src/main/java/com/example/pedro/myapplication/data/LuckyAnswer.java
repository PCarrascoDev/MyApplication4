package com.example.pedro.myapplication.data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Pedro on 11-04-2017.
 */

public class LuckyAnswer {
    private boolean happy, luckyday;

    public LuckyAnswer(boolean happy) {
        this.happy = happy;
        luckyday = new LuckyDate().day();
    }

    public boolean isHappy(){
        return happy;
    }

    public boolean isLuclyday(){
        return luckyday;
    }

    private class LuckyDate {

        public boolean day(){
            Date today = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
            String auxDay = simpleDateFormat.format(today);
            int day = Integer.parseInt(auxDay);
            if (day % 2 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}

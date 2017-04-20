package com.example.pedro.myapplication.data;

/**
 * Created by Pedro on 18-04-2017.
 */

public class LuckyResult extends LuckyAnswer {
    public LuckyResult(boolean happy)
    {
        super(happy);
    }

    private String proccessingHappy()
    {
        if (isHappy())
        {
            return "Que bien, mantente positivo";
        }
        else
        {
            return "Fuerza perro";
        }
    }

    private String proccessingDay()
    {
        if(isLuclyday())
        {
            return ", es tu dia de suerte";
        }
        else
        {
            return ", vendran dias mejores";
        }
    }
    public String result()
    {
        return proccessingHappy() + proccessingDay();
    }
}


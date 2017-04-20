package com.example.pedro.myapplication.data;

/**
 * Created by Pedro on 18-04-2017.
 */

public class MatchResult extends MatchAnswer {
    public MatchResult(int userAge, int loverAge) {
        super(userAge, loverAge);
    }

    public String result()
    {
        if (isMatch())
        {
            return "Son match! :D";
        }
        else
        {
            return "Corre! D:";
        }
    }
}

package com.example.pedro.myapplication.data;

/**
 * Created by Pedro on 18-04-2017.
 */

public class MatchAnswer {
    private int userAge, loverAge;

    public MatchAnswer(int userAge, int loverAge) {
        this.userAge = userAge;
        this.loverAge = loverAge;
    }

    public int getUserAge() {
        return userAge;
    }

    public int getLoverAge() {
        return loverAge;
    }

    public boolean isMatch()
    {
        int deltaAge;
        if (userAge >= loverAge)
        {
            deltaAge = userAge - loverAge;
        }
        else
        {
            deltaAge = loverAge - userAge;
        }

        if (deltaAge > 8)
        {
            return false; //false si no son match
        }
        else
        {
            return true;
        }
    }
}

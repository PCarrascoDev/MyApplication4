package com.example.pedro.myapplication.data;

/**
 * Created by Pedro on 06-04-2017.
 */

public class PartyResult extends PartyAnswer {
    public PartyResult(String answer) {
        super(answer);
    }
    public String score(){
        return processing();
    }

    private String processing(){
        String answer = getAnswer();
        if (answer.contains("5"))
        {
            return "Respuesta 1";
        }
        else if (answer.contains("10"))
        {
            return "Respuesta 2";
        }
        else
        {
            return "Respuesta 3";
        }
    }
}

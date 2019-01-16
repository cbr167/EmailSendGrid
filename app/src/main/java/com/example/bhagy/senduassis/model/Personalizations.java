package com.example.bhagy.senduassis.model;

/**
 * Created by bhagy on 1/15/2019.
 */

public class Personalizations {
    private To[] to;

    private String subject;

    public To[] getTo ()
    {
        return to;
    }

    public void setTo (To[] to)
    {
        this.to = to;
    }

    public String getSubject ()
    {
        return subject;
    }

    public void setSubject (String subject)
    {
        this.subject = subject;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [to = "+to+", subject = "+subject+"]";
    }
}

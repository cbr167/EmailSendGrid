package com.example.bhagy.senduassis.model;

/**
 * Created by bhagy on 1/15/2019.
 */

public class Content {

    private String value;

    private String type;

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [value = "+value+", type = "+type+"]";
    }
}

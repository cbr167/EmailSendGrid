package com.example.bhagy.senduassis.model;

/**
 * Created by bhagy on 1/15/2019.
 */

public class From {
    private String email;

    private String name;

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [email = "+email+", name = "+name+"]";
    }
}

package com.example.bhagy.senduassis.model;

/**
 * Created by bhagy on 1/15/2019.
 */

public class EmailBody {
    private Content[] content;

    private Personalizations[] personalizations;

    private Reply_to reply_to;

    private From from;

    public Content[] getContent ()
    {
        return content;
    }

    public void setContent (Content[] content)
    {
        this.content = content;
    }

    public Personalizations[] getPersonalizations ()
    {
        return personalizations;
    }

    public void setPersonalizations (Personalizations[] personalizations)
    {
        this.personalizations = personalizations;
    }

    public Reply_to getReply_to ()
    {
        return reply_to;
    }

    public void setReply_to (Reply_to reply_to)
    {
        this.reply_to = reply_to;
    }

    public From getFrom ()
    {
        return from;
    }

    public void setFrom (From from)
    {
        this.from = from;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", personalizations = "+personalizations+", reply_to = "+reply_to+", from = "+from+"]";
    }
}

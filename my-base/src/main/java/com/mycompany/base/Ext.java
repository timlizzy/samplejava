package com.mycompany.base;


public class Ext
{

    private String theText;

    public Ext(String text)
    {
        theText = text + " (das ist der Zusatz aus Ext)";
    }

    public String getText()
    {
      return theText;
    }
}

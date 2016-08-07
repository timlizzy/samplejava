package com.mycompany.app;

import com.mycompany.base.Ext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Ext oExt = new Ext("krasse Sache");
        Toll oToll = new Toll(oExt.getText());
        //Toll oToll = new Toll("hajo");
        System.out.println( oToll.getText() );
    }
}

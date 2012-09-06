/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhuyanbin.mapeditor;

import org.puremvc.java.patterns.observer.Notification;

/**
 *
 * @author flavor
 */
public class App
{
    public App()
    {
    }
    
    public static void main(String args[])
    {
        AppFacade.getInstance().notifyObservers(new Notification(NotiConst.STARTUP));
    }
}

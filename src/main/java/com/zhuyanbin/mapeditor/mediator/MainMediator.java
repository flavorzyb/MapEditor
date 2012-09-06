/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhuyanbin.mapeditor.mediator;

import com.zhuyanbin.mapeditor.NotiConst;
import com.zhuyanbin.mapeditor.view.MainWindow;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.mediator.Mediator;

/**
 *
 * @author flavor
 */
public class MainMediator extends Mediator 
{
    /**
     * The default name of the <code>MainMediator</code>.
     */
    final public static String NAME = "MainMediator";
    public MainMediator(String mediatorName, MainWindow viewComponent )
    {
        super(mediatorName, viewComponent);
    }
    
    @Override
    public MainWindow getViewComponent()
    {
        return (MainWindow) viewComponent;
    }
    
    @Override
    public String[] listNotificationInterests( )
    {
        return new String[] {NotiConst.S_MEDIATOR_MAIN_SHOW};
    }
    
    @Override
    public void handleNotification( INotification notification )
    {
        String notiName = notification.getName();
        
        if (notiName.equals(NotiConst.S_MEDIATOR_MAIN_SHOW))
        {
            if (!getViewComponent().isActive())
            {
                getViewComponent().setVisible(true);
            }
        }
    }
}

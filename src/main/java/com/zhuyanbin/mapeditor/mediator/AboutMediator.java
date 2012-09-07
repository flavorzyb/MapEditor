/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhuyanbin.mapeditor.mediator;

import com.zhuyanbin.mapeditor.NotiConst;
import com.zhuyanbin.mapeditor.view.AboutDialog;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.mediator.Mediator;

/**
 *
 * @author flavor
 */
public class AboutMediator extends Mediator
{
    final public static String NAME = "AboutMediator";
    
    public AboutMediator(String mediatorName, AboutDialog viewComponent)
    {
        super(mediatorName, viewComponent);
    }
    
    /**
     * 获取关于窗口
     * 
     * @return 
     *          关于窗口
     */
    @Override
    public AboutDialog getViewComponent()
    {
        return (AboutDialog) viewComponent;
    }
    
    @Override
    public String[] listNotificationInterests( )
    {
        return new String[] {NotiConst.S_MEDIATOR_ABOUTME_OPEN, NotiConst.S_MEDIATOR_ABOUTME_CLOSE};
    }
    
    @Override
    public void handleNotification( INotification notification )
    {
        String notiName = notification.getName();
        
        if (notiName.equals(NotiConst.S_MEDIATOR_ABOUTME_OPEN))
        {
            if (!getViewComponent().isActive())
            {
                getViewComponent().setVisible(true);
            }
        }
        else if (notiName.equals(NotiConst.S_MEDIATOR_ABOUTME_CLOSE))
        {
            getViewComponent().setVisible(false);
        }
    }
    
    @Override
    public void onRemove()
    {
        getViewComponent().dispose();
        setViewComponent(null);
    }
}

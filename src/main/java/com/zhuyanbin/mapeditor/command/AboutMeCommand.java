/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhuyanbin.mapeditor.command;

import com.zhuyanbin.mapeditor.NotiConst;
import com.zhuyanbin.mapeditor.mediator.AboutMediator;
import com.zhuyanbin.mapeditor.view.AboutDialog;
import com.zhuyanbin.mapeditor.view.MainWindow;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.command.SimpleCommand;

/**
 *
 * @author flavor
 */
public class AboutMeCommand extends SimpleCommand
{
    /**
     * 
     * @param notification 
     *                      通知对象
     */
    @Override
    public void execute( INotification notification )
    {
        MainWindow mw = (MainWindow) notification.getBody();
        String notiName = notification.getName();
        
        if (notiName.equals(NotiConst.S_COMMAND_ABOUTME_OPEN))
        {
            initMeditor(mw);
            sendNotification(NotiConst.S_MEDIATOR_ABOUTME_OPEN);
        }
        else if(notiName.equals(NotiConst.S_COMMAND_ABOUTME_CLOSE))
        {
            sendNotification(NotiConst.S_MEDIATOR_ABOUTME_CLOSE);
            removeMediator();
        }
    }
    
    private void initMeditor(MainWindow mw)
    {
        if(!facade.hasMediator(AboutMediator.NAME))
        {
            facade.registerMediator(new AboutMediator(AboutMediator.NAME, AboutDialog.factory(mw)));
        }
    }
    
    private void removeMediator()
    {
        if(facade.hasMediator(AboutMediator.NAME))
        {
            facade.removeMediator(AboutMediator.NAME);
        }
    }
}

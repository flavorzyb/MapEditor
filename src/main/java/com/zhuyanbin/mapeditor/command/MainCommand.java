/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhuyanbin.mapeditor.command;

import com.zhuyanbin.mapeditor.NotiConst;
import com.zhuyanbin.mapeditor.mediator.MainMediator;
import com.zhuyanbin.mapeditor.view.MainWindow;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.command.SimpleCommand;

/**
 *
 * @author flavor
 */
public class MainCommand extends SimpleCommand
{
    /**
     * 
     * @param notification 
     *                      通知对象
     */
    @Override
    public void execute( INotification notification )
    {
        initMediator();
        sendNotification(NotiConst.S_MEDIATOR_MAIN_SHOW);
    }
    
    private void initMediator()
    {
        if (!facade.hasMediator(MainMediator.NAME))
        {
            facade.registerMediator(new MainMediator(MainMediator.NAME, new MainWindow()));
        }
    }
}

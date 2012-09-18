package com.zhuyanbin.mapeditor.view.mainwindow;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.puremvc.java.patterns.facade.Facade;

import com.zhuyanbin.mapeditor.NotiConst;

public class WindowResizeListener implements Listener
{
    @Override 
    public void handleEvent(Event event)
    {
        Facade.getInstance().sendNotification(NotiConst.S_MEDIATOR_MAIN_RESIZE);
    }
}

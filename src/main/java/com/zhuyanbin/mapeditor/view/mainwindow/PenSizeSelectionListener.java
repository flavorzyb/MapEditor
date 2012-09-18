package com.zhuyanbin.mapeditor.view.mainwindow;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.puremvc.java.patterns.facade.Facade;

import com.zhuyanbin.mapeditor.NotiConst;

public class PenSizeSelectionListener implements SelectionListener
{
    
    @Override
    public void widgetSelected(SelectionEvent e)
    {
        Facade.getInstance().sendNotification(NotiConst.S_MEDIATOR_MAIN_PEN_SIZE_CHANGE);
    }
    
    @Override
    public void widgetDefaultSelected(SelectionEvent e)
    {
    }
}

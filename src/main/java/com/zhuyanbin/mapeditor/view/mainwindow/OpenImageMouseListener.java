package com.zhuyanbin.mapeditor.view.mainwindow;


import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.puremvc.java.patterns.facade.Facade;

import com.zhuyanbin.mapeditor.NotiConst;

public class OpenImageMouseListener implements MouseListener
{
    @Override
    public void mouseDoubleClick(MouseEvent e)
    {
    }
    
    @Override
    public void mouseDown(MouseEvent e)
    {
        Facade.getInstance().sendNotification(NotiConst.S_MEDIATOR_MAIN_OPEN_IMAGE_DIALOG);
    }
    
    @Override
    public void mouseUp(MouseEvent e)
    {
    }
}

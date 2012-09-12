package com.zhuyanbin.mapeditor.view.aboutdialog;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.puremvc.java.patterns.facade.Facade;

import com.zhuyanbin.mapeditor.NotiConst;

public class BtnCloseMouseListener implements MouseListener
{
    
    @Override
    public void mouseDoubleClick(MouseEvent e)
    {
    }
    
    @Override
    public void mouseDown(MouseEvent e)
    {
        Facade.getInstance().sendNotification(NotiConst.S_COMMAND_ABOUTME_CLOSE);
    }
    
    @Override
    public void mouseUp(MouseEvent e)
    {
    }
}

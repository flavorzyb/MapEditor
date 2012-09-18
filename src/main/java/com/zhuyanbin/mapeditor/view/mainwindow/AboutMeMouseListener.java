package com.zhuyanbin.mapeditor.view.mainwindow;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.puremvc.java.patterns.facade.Facade;

import com.zhuyanbin.mapeditor.NotiConst;
import com.zhuyanbin.mapeditor.view.MainWindow;

public class AboutMeMouseListener implements MouseListener
{
    private MainWindow _mw = null;
    
    public AboutMeMouseListener(MainWindow mw)
    {
        setWindow(mw);
    }
    
    protected void setWindow(MainWindow mw)
    {
        _mw = mw;
    }
    
    protected MainWindow getWindow()
    {
        return _mw;
    }
    
    @Override
    public void mouseDoubleClick(MouseEvent e)
    {
    }
    
    @Override
    public void mouseDown(MouseEvent e)
    {
        Facade.getInstance().sendNotification(NotiConst.S_COMMAND_ABOUTME_OPEN, getWindow());
    }
    
    @Override
    public void mouseUp(MouseEvent e)
    {
    }
    
    public void free()
    {
        setWindow(null);
    }
}

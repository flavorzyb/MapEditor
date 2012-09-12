package com.zhuyanbin.mapeditor.view.mainwindow;


import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.FileDialog;
import org.puremvc.java.patterns.facade.Facade;

import com.zhuyanbin.mapeditor.NotiConst;
import com.zhuyanbin.mapeditor.view.MainWindow;

public class BtnOpenImageMouseListener implements MouseListener
{
    private MainWindow _mw = null;
    
    private void setWindow(MainWindow mw)
    {
        _mw = mw;
    }
    
    private MainWindow getWindow()
    {
        return _mw;
    }
    
    public BtnOpenImageMouseListener(MainWindow mw)
    {
        setWindow(mw);
    }
    
    @Override
    public void mouseDoubleClick(MouseEvent e)
    {
    }
    
    @Override
    public void mouseDown(MouseEvent e)
    {
        String []filter = {"*.jpg","*.png","*.gif"};
        
        FileDialog fd = new FileDialog(getWindow());
        fd.setText("打开图片");
        fd.setFilterExtensions(filter);
        Facade.getInstance().sendNotification(NotiConst.S_MEDIATOR_MAIN_OPEN_IMAGE, fd.open());
    }
    
    @Override
    public void mouseUp(MouseEvent e)
    {
    }
    
}

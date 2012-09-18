package com.zhuyanbin.mapeditor.view.mainwindow;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import com.zhuyanbin.mapeditor.view.MainWindow;

public class WindowResizeListener implements Listener
{
    private MainWindow _mw = null;
    
    public WindowResizeListener(MainWindow mw)
    {
        setWindow(mw);
    }
    
    private void setWindow(MainWindow mw)
    {
        _mw = mw;
    }
    
    private MainWindow getWindow()
    {
        return _mw;
    }
    
    @Override 
    public void handleEvent(Event event)
    {
        MainWindow mw = getWindow();
        if (mw instanceof MainWindow)
        {
            mw.updateScrollPanelLocationXY(mw.getSize().x, mw.getSize().y);
        }
    }
    
    public void free()
    {
        setWindow(null);
    }
}

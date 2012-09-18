package com.zhuyanbin.mapeditor.view.mainwindow;

import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.puremvc.java.patterns.facade.Facade;

import com.zhuyanbin.mapeditor.NotiConst;

public class CanvasPaintListener implements PaintListener
{
    @Override
    public void paintControl(PaintEvent e)
    {
        Facade.getInstance().sendNotification(NotiConst.S_MEDIATOR_MAIN_DRAW_LINE_GRID, e.gc);
    }
}

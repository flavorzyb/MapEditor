package com.zhuyanbin.mapeditor.view.mainwindow;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.puremvc.java.patterns.facade.Facade;

import com.zhuyanbin.mapeditor.NotiConst;

public class FillCanvasMouseMoveListener implements MouseMoveListener
{
    
    @Override
    public void mouseMove(MouseEvent e)
    {
        Facade.getInstance().sendNotification(NotiConst.S_MEDIATOR_MAIN_FILLCANVAS_MOUSE_MOVE, e);
    }
}

package com.zhuyanbin.mapeditor.view.mainwindow;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.wb.swt.SWTResourceManager;

public class CanvasPaintListener implements PaintListener
{
    private Canvas _cv = null;
    
    private void setCanvas(Canvas cv)
    {
        _cv = cv;
    }
    
    private Canvas getCanvas()
    {
        return _cv;
    }
    
    public CanvasPaintListener(Canvas cv)
    {
        setCanvas(cv);
    }
    
    @Override
    public void paintControl(PaintEvent e)
    {
        GC gc = new GC(getCanvas(), SWT.LINE_SOLID);
        gc.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
        gc.drawLine(0, 0, 200, 200);
        gc.drawRectangle(20, 50, 100, 100);
        gc.dispose();
        gc = null;
    }
}

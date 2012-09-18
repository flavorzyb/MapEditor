package com.zhuyanbin.mapeditor.view.mainwindow;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.wb.swt.SWTResourceManager;

public class BtnShowGridSelectListener extends SelectionAdapter
{
    private Canvas _cv = null;
    
    public BtnShowGridSelectListener(Canvas cv)
    {
        setCanvas(cv);
    }
    
    private void setCanvas(Canvas cv)
    {
        _cv = cv;
    }
    
    private Canvas getCanvas()
    {
        return _cv;
    }
    @Override
    public void widgetSelected(SelectionEvent e) 
    {
        Button btnShowGrid = (Button) e.getSource();
        if (btnShowGrid instanceof Button)
        {
            if (btnShowGrid.getSelection())
            {
                getCanvas().setVisible(true);
                GC gc = new GC(getCanvas(), SWT.LINE_SOLID);
                gc.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
                gc.drawLine(0, 0, 200, 200);
                gc.drawRectangle(20, 50, 100, 100);
                gc.dispose();
                gc = null;
            }
            else
            {
                getCanvas().setVisible(false);
            }
        }
    }
}

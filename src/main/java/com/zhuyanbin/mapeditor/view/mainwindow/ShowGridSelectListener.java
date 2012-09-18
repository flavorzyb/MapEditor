package com.zhuyanbin.mapeditor.view.mainwindow;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.puremvc.java.patterns.facade.Facade;

import com.zhuyanbin.mapeditor.NotiConst;

public class ShowGridSelectListener extends SelectionAdapter
{
    
    @Override
    public void widgetSelected(SelectionEvent e) 
    {
        Button btnShowGrid = (Button) e.getSource();
        if (btnShowGrid instanceof Button)
        {
            Facade.getInstance().sendNotification(NotiConst.S_MEDIATOR_MAIN_SHOW_GRID, btnShowGrid.getSelection());
        }
    }
}

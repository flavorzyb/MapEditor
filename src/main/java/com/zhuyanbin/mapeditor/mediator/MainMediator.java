/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhuyanbin.mapeditor.mediator;

import com.zhuyanbin.mapeditor.NotiConst;
import com.zhuyanbin.mapeditor.view.MainWindow;
import com.zhuyanbin.mapeditor.view.grid.LineGrid;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.facade.Facade;
import org.puremvc.java.patterns.mediator.Mediator;

/**
 *
 * @author flavor
 */
public class MainMediator extends Mediator 
{
    /**
     * The default name of the <code>MainMediator</code>.
     */
    final public static String NAME = "MainMediator";
    public MainMediator(String mediatorName, MainWindow viewComponent )
    {
        super(mediatorName, viewComponent);
    }
    
    @Override
    public MainWindow getViewComponent()
    {
        return (MainWindow) viewComponent;
    }
    
    @Override
    public String[] listNotificationInterests( )
    {
        return new String[] {
                NotiConst.S_MEDIATOR_MAIN_SHOW, 
                NotiConst.S_MEDIATOR_MAIN_OPEN_IMAGE_DIALOG,
                NotiConst.S_MEDIATOR_MAIN_OPEN_IMAGE,
                NotiConst.S_MEDIATOR_MAIN_OPEN_ABOUTME,
                NotiConst.S_MEDIATOR_MAIN_RESIZE,
                NotiConst.S_MEDIATOR_MAIN_DRAW_LINE_GRID,
                NotiConst.S_MEDIATOR_MAIN_SHOW_GRID,
                NotiConst.S_MEDIATOR_MAIN_FILLCANVAS_MOUSE_STATUS,
                NotiConst.S_MEDIATOR_MAIN_FILLCANVAS_MOUSE_MOVE,
                NotiConst.S_MEDIATOR_MAIN_PEN_SIZE_CHANGE
                };
    }
    
    @Override
    public void handleNotification( INotification notification )
    {
        String notiName = notification.getName();
        
        if (notiName.equals(NotiConst.S_MEDIATOR_MAIN_SHOW))
        {
            openWindow();
        }
        else if(notiName.equals(NotiConst.S_MEDIATOR_MAIN_OPEN_IMAGE))
        {
            String fileName = (String) notification.getBody();
            getViewComponent().showImage(fileName);
        }
        else if (notiName.equals(NotiConst.S_MEDIATOR_MAIN_OPEN_ABOUTME))
        {
            facade.sendNotification(NotiConst.S_COMMAND_ABOUTME_OPEN, getViewComponent());
        }
        else if (notiName.equals(NotiConst.S_MEDIATOR_MAIN_RESIZE))
        {
            getViewComponent().updateScrollPanelLocationXY(getViewComponent().getSize().x, getViewComponent().getSize().y);
            getViewComponent().updateGridSize();
        }
        else if (notiName.equals(NotiConst.S_MEDIATOR_MAIN_OPEN_IMAGE_DIALOG))
        {
            openImageDialog();
        }
        else if (notiName.equals(NotiConst.S_MEDIATOR_MAIN_DRAW_LINE_GRID))
        {
            GC gc = (GC) notification.getBody();
            if (null != gc)
            {
                drawLineGrid(gc);
            }
        }
        else if (notiName.equals(NotiConst.S_MEDIATOR_MAIN_SHOW_GRID))
        {
            boolean visible = (boolean) notification.getBody();
            showGrid(visible);
        }
        else if (notiName.equals(NotiConst.S_MEDIATOR_MAIN_FILLCANVAS_MOUSE_STATUS))
        {
            boolean isDown = (boolean) notification.getBody();
            getViewComponent().updateFillMouseDown(isDown);
        }
        else if (notiName.equals(NotiConst.S_MEDIATOR_MAIN_FILLCANVAS_MOUSE_MOVE))
        {
            MouseEvent e = (MouseEvent) notification.getBody();
            if (getViewComponent().getFillMouseDown())
            {
                System.out.println("x:"+e.x+",y:"+e.y);
            }
        }
        else if (notiName.equals(NotiConst.S_MEDIATOR_MAIN_PEN_SIZE_CHANGE))
        {
            getViewComponent().updatePenSizeTips();
        }
    }
    
    public void openWindow()
    {
        try 
        {
            Display display = getViewComponent().getDisplay();
            MainWindow shell = getViewComponent();
            shell.open();
            shell.layout();
            while (!shell.isDisposed()) 
            {
                if (!display.readAndDispatch()) 
                {
                    display.sleep();
                }
            }
            
            display.dispose();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    private void openImageDialog()
    {
        String []filter = {"*.jpg","*.png","*.gif"};
        
        FileDialog fd = new FileDialog(getViewComponent());
        fd.setText("打开图片");
        fd.setFilterExtensions(filter);
        Facade.getInstance().sendNotification(NotiConst.S_MEDIATOR_MAIN_OPEN_IMAGE, fd.open());
    }
    
    private void drawLineGrid(GC gc)
    {
        LineGrid lg = new LineGrid(gc, getViewComponent().getGridVO());
        lg.drawGrid();
        lg.free();
        lg = null;
    }
    
    private void showGrid(boolean visible)
    {
        getViewComponent().showGrid(visible);
    }
}

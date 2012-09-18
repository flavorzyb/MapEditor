/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhuyanbin.mapeditor.mediator;

import com.zhuyanbin.mapeditor.NotiConst;
import com.zhuyanbin.mapeditor.view.MainWindow;

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
                NotiConst.S_MEDIATOR_MAIN_RESIZE};
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
        }
        else if (notiName.equals(NotiConst.S_MEDIATOR_MAIN_OPEN_IMAGE_DIALOG))
        {
            openImageDialog();
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
}

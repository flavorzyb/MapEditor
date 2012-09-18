package com.zhuyanbin.mapeditor.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.puremvc.java.patterns.facade.Facade;

import com.zhuyanbin.mapeditor.NotiConst;
import com.zhuyanbin.mapeditor.Version;

import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;

public class AboutDialog extends Shell
{
    private CloseMouseListener _closeMouseListener = null;
    private Button _btnClose = null;
    
    public AboutDialog()
    {
        this(Display.getCurrent());
    }
    
    /**
     * Create the shell.
     * @param display
     */
    public AboutDialog(Display display)
    {
        super(display, SWT.CLOSE | SWT.TITLE | SWT.APPLICATION_MODAL | SWT.DIALOG_TRIM);
        createContents();
        addEvents();
    }
    
    public static AboutDialog factory(Composite cParent)
    {
        AboutDialog win = new AboutDialog();
        win.setParent(cParent);
        
        return win;
    }
    
    /**
     * Create contents of the shell.
     */
    protected void createContents()
    {
        setText("关于MapEditor");
        setSize(350, 250);
        
        Label lbAboutMe = new Label(this, SWT.NONE);
        lbAboutMe.setAlignment(SWT.CENTER);
        lbAboutMe.setFont(SWTResourceManager.getFont("Lucida Grande", 20, SWT.BOLD));
        lbAboutMe.setBounds(117, 26, 166, 36);
        lbAboutMe.setText("关于MapEditor");
        
        Label lbAuthor = new Label(this, SWT.NONE);
        lbAuthor.setBounds(130, 80, 180, 14);
        lbAuthor.setText("作者: "+Version.AUTHOR);
        
        Label lbVersion = new Label(this, SWT.NONE);
        lbVersion.setBounds(130, 118, 180, 14);
        lbVersion.setText("版本: "+Version.VERSION);
        
        Label lbDate = new Label(this, SWT.NONE);
        lbDate.setBounds(130, 154, 180, 14);
        lbDate.setText("时间: "+Version.DATE_TIME);
        
        _btnClose = new Button(this, SWT.NONE);
        _btnClose.setBounds(120, 190, 94, 28);
        _btnClose.setText("关闭窗口");
    }
    
    protected void sendCloseEvent()
    {
        Facade.getInstance().sendNotification(NotiConst.S_COMMAND_ABOUTME_CLOSE);
    }

    private void addEvents()
    {
        _closeMouseListener = new CloseMouseListener();
        if (null != _btnClose)
        {
            _btnClose.addMouseListener(_closeMouseListener);
        }
    }
    
    private void removeEvents()
    {
        if (null != _closeMouseListener)
        {
            if (null != _btnClose)
            {
                _btnClose.removeMouseListener(_closeMouseListener);
            }
            _closeMouseListener = null;
        }
    }
    
    @Override
    public void dispose()
    {
        removeEvents();
        super.dispose();
        sendCloseEvent();
    }
    
    @Override
    protected void checkSubclass()
    {
    }
    
    class CloseMouseListener implements MouseListener
    {
        @Override
        public void mouseUp(MouseEvent e)
        {
        }
        
        @Override
        public void mouseDown(MouseEvent e)
        {
            Facade.getInstance().sendNotification(NotiConst.S_COMMAND_ABOUTME_CLOSE);
        }
        
        @Override
        public void mouseDoubleClick(MouseEvent e)
        {
        }
    }
}

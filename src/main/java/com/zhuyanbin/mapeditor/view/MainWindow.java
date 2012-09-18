package com.zhuyanbin.mapeditor.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.CCombo;

import com.zhuyanbin.mapeditor.view.mainwindow.AboutMeMouseListener;
import com.zhuyanbin.mapeditor.view.mainwindow.OpenImageMouseListener;
import com.zhuyanbin.mapeditor.view.mainwindow.BtnShowGridSelectListener;
import com.zhuyanbin.mapeditor.view.mainwindow.CanvasPaintListener;
import com.zhuyanbin.mapeditor.view.mainwindow.WindowResizeListener;

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.wb.swt.SWTResourceManager;

public class MainWindow extends Shell 
{
    private Composite imageComposite = null;
    
    private ScrolledComposite scrollPanel = null;
    
    private Canvas cv = null;
    
    private Button _btnOpenImage = null;
    
    private Button _btnAboutMe = null;
    
    private WindowResizeListener _winResizeListener = null;
    
    private OpenImageMouseListener _openImageListener = null;
    
    private AboutMeMouseListener _aboutMeMouseListener = null;
	public MainWindow()
	{
		this(Display.getDefault());
	}
	
	/**
	 * Create the shell.
	 * @param display
	 */
	public MainWindow(Display display) 
	{
		super(display, SWT.SHELL_TRIM);
		createContents();
		addEvents();
	}
	
	private void addEvents()
	{
	    _winResizeListener = new WindowResizeListener(this);
	    addListener(SWT.Resize, _winResizeListener);
	    
	    _openImageListener = new OpenImageMouseListener(this);
	    _btnOpenImage.addMouseListener(_openImageListener);
	    
	    _aboutMeMouseListener = new AboutMeMouseListener(this);
	    _btnAboutMe.addMouseListener(_aboutMeMouseListener);
	}
	
	private void removeEvents()
	{
	    if (null != _winResizeListener)
	    {
	        removeListener(SWT.Resize, _winResizeListener);
	        _winResizeListener.free();
	        _winResizeListener = null;
	    }
	    
	    if (null != _openImageListener)
	    {
	        _btnOpenImage.removeMouseListener(_openImageListener);
	        _openImageListener.free();
	        _openImageListener = null;
	    }
	    
	    if (null != _aboutMeMouseListener)
	    {
	        _btnAboutMe.removeMouseListener(_aboutMeMouseListener);
	        _aboutMeMouseListener.free();
	        _aboutMeMouseListener = null;
	    }
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() 
	{
		setText("地图编辑器");
		setSize(1000, 600);
		
		_btnOpenImage = new Button(this, SWT.NONE);
		_btnOpenImage.setBounds(0, 0, 80, 28);
		_btnOpenImage.setText("打开图片");
		
		Button btnLoadMapData = new Button(this, SWT.NONE);
		btnLoadMapData.setBounds(80, 0, 110, 28);
		btnLoadMapData.setText("载入地图数据");
		
		Button btnLoadMonsterData = new Button(this, SWT.NONE);
		btnLoadMonsterData.setBounds(190, 0, 110, 28);
		btnLoadMonsterData.setText("载入怪物数据");
		
		CCombo combo = new CCombo(this, SWT.BORDER);
		combo.setItems(new String[] {"不可走动-1", "透明区域-2", "怪物区域1-10", "怪物区域1-10", "怪物区域2-11", "怪物区域3-12", "怪物区域4-13"});
		combo.select(0);
		combo.setBounds(300, 4, 100, 18);
		
		Button btnShowGrid = new Button(this, SWT.CHECK);
		btnShowGrid.setBounds(417, 0, 77, 24);
		btnShowGrid.setText("显示网格");
		
		Button btnMode = new Button(this, SWT.CHECK);
        btnMode.setBounds(500, 1, 80, 24);
        btnMode.setText("1/2模式");
        
        Button btnClean = new Button(this, SWT.NONE);
        btnClean.setBounds(576, 0, 60, 28);
        btnClean.setText("清除");
        
        Button btnSaveMap = new Button(this, SWT.NONE);
        btnSaveMap.setBounds(639, 0, 80, 28);
        btnSaveMap.setText("保存地图");
        
        Button btnSaveMonsterData = new Button(this, SWT.NONE);
        btnSaveMonsterData.setBounds(725, 0, 94, 28);
        btnSaveMonsterData.setText("保存怪物数据");
        
        Button btnSystemConfig = new Button(this, SWT.NONE);
        btnSystemConfig.setBounds(820, 0, 80, 28);
        btnSystemConfig.setText("系统配置");
        
        _btnAboutMe = new Button(this, SWT.NONE);
        _btnAboutMe.setBounds(900, 0, 60, 28);
        _btnAboutMe.setText("关于");
        
        Label lbRealLocation = new Label(this, SWT.NONE);
        lbRealLocation.setBounds(10, 34, 59, 14);
        lbRealLocation.setText("真实坐标");
        
        Label lbRealX = new Label(this, SWT.NONE);
        lbRealX.setBounds(10, 54, 59, 14);
        lbRealX.setText("x:");
        
        Label lbPathLocation = new Label(this, SWT.NONE);
        lbPathLocation.setBounds(10, 79, 59, 14);
        lbPathLocation.setText("路径坐标");
        
        Label lbPathX = new Label(this, SWT.NONE);
        lbPathX.setBounds(10, 99, 59, 14);
        lbPathX.setText("x:");
        
        Button btnLockLocation = new Button(this, SWT.NONE);
        btnLockLocation.setBounds(0, 119, 80, 28);
        btnLockLocation.setText("锁定坐标");
        
        Label lbLayer = new Label(this, SWT.NONE);
        lbLayer.setBounds(10, 156, 60, 14);
        lbLayer.setText("图层");
        
        Button cbBaseLayer = new Button(this, SWT.CHECK);
        cbBaseLayer.setBounds(10, 176, 93, 18);
        cbBaseLayer.setText("基本图层");
        
        Button cbMonsterLayer = new Button(this, SWT.CHECK);
        cbMonsterLayer.setBounds(10, 201, 93, 18);
        cbMonsterLayer.setText("怪物图层");
        
        Label lbPenSize = new Label(this, SWT.NONE);
        lbPenSize.setBounds(10, 249, 59, 14);
        lbPenSize.setText("画笔大小");
        
        Slider slider = new Slider(this, SWT.NONE);
        slider.setBounds(5, 267, 80, 15);
        
        Group btnGroup = new Group(this, SWT.NONE);
        btnGroup.setBounds(0, 295, 100, 82);

        Button btnPen = new Button(btnGroup, SWT.RADIO);
        btnPen.setText("画笔");
        btnPen.setSelection(true);
        btnPen.setBounds(5, 10, 91, 18);
        
        Button btnEraser = new Button(btnGroup, SWT.RADIO);
        btnEraser.setText("橡皮");
        btnEraser.setBounds(5, 37, 91, 18);
        
        scrollPanel = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        scrollPanel.setExpandVertical(true);
        scrollPanel.setExpandHorizontal(true);
        scrollPanel.setAlwaysShowScrollBars(true);
        scrollPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
        scrollPanel.setLayout(new GridLayout(1, false));
        scrollPanel.setBounds(111, 37, 868, 528);
        
        imageComposite = new Composite(scrollPanel, SWT.NONE);
        scrollPanel.setContent(imageComposite);
        imageComposite.setLayout(new GridLayout(0, false));
        
        cv = new Canvas(imageComposite, SWT.NO_BACKGROUND);
        cv.setLocation(0, 0);
        cv.addPaintListener(new CanvasPaintListener(cv));
        
        // 绑定事件
        btnShowGrid.addSelectionListener(new BtnShowGridSelectListener(cv));
	}
	
	public void updateScrollPanelLocationXY(int width, int height)
	{
	    if (imageComposite instanceof Composite)
	    {
    	    Image image = imageComposite.getBackgroundImage();
    	    
    	    int spWidth = width - 132;
    	    int spHeight = height - 72; 
    	    
    	    if (image instanceof Image)
    	    {
    	        if (image.getBounds().width < spWidth)
    	        {
    	            spWidth = image.getBounds().width;
    	        }
    	        
    	        if (image.getBounds().height < spHeight)
    	        {
    	            spHeight = image.getBounds().height;
    	        }
    	    }
            
            if (scrollPanel instanceof ScrolledComposite)
            {
                if (image instanceof Image)
                {
                    scrollPanel.setMinHeight(image.getBounds().height);
                    scrollPanel.setMinWidth(image.getBounds().width);
                }
                scrollPanel.setSize(spWidth, spHeight);
            }
	    }
	}
	
	public void showImage(String fileName)
	{
	    if ((null != fileName) && (null != imageComposite))
	    {
	        Image image = SWTResourceManager.getImage(fileName);
	        imageComposite.setBackgroundImage(image);
	        
	        int width = getSize().x;
	        int height = getSize().y;
	        
	        if ((image.getBounds().width > (width-132)) || (image.getBounds().height > (height-72)))
            {
                imageComposite.setSize(imageComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
            }
            else
            {
                imageComposite.setSize(image.getBounds().width, image.getBounds().height);
            }
	        
	        cv.setSize(imageComposite.getSize());
	        updateScrollPanelLocationXY(width, height);
	    }
	}
	
	@Override
	protected void checkSubclass() 
	{
		// Disable the check that prevents subclassing of SWT components
	}
	
	@Override
	public void dispose()
	{
	    removeEvents();
	    super.dispose();
	}
}

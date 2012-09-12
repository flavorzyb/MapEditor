package com.zhuyanbin.mapeditor.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.CCombo;

import com.zhuyanbin.mapeditor.view.mainwindow.BtnAboutMeMouseListener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.custom.ScrolledComposite;

public class MainWindow extends Shell 
{
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
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() 
	{
		setText("地图编辑器");
		setSize(1000, 600);
		
		Button btnOpenImage = new Button(this, SWT.NONE);
		btnOpenImage.setBounds(0, 0, 80, 28);
		btnOpenImage.setText("打开图片");
		
		Button btnLoadMapData = new Button(this, SWT.NONE);
		btnLoadMapData.setBounds(85, 0, 94, 28);
		btnLoadMapData.setText("载入地图数据");
		
		Button btnLoadMonsterData = new Button(this, SWT.NONE);
		btnLoadMonsterData.setBounds(180, 0, 94, 28);
		btnLoadMonsterData.setText("载入怪物数据");
		
		CCombo combo = new CCombo(this, SWT.BORDER);
		combo.setItems(new String[] {"不可走动-1", "透明区域-2", "怪物区域1-10", "怪物区域1-10", "怪物区域2-11", "怪物区域3-12", "怪物区域4-13"});
		combo.select(0);
		combo.setBounds(280, 4, 100, 18);
		
		Button btnShowGrid = new Button(this, SWT.CHECK);
		btnShowGrid.setBounds(397, 0, 77, 24);
		btnShowGrid.setText("显示网格");
		
		Button btnMode = new Button(this, SWT.CHECK);
        btnMode.setBounds(480, 1, 80, 24);
        btnMode.setText("1/2模式");
        
        Button btnClean = new Button(this, SWT.NONE);
        btnClean.setBounds(546, 0, 60, 28);
        btnClean.setText("清除");
        
        Button btnSaveMap = new Button(this, SWT.NONE);
        btnSaveMap.setBounds(609, 0, 80, 28);
        btnSaveMap.setText("保存地图");
        
        Button btnSaveMonsterData = new Button(this, SWT.NONE);
        btnSaveMonsterData.setBounds(695, 0, 94, 28);
        btnSaveMonsterData.setText("保存怪物数据");
        
        Button btnSystemConfig = new Button(this, SWT.NONE);
        btnSystemConfig.setBounds(790, 0, 80, 28);
        btnSystemConfig.setText("系统配置");
        
        Button btnAboutMe = new Button(this, SWT.NONE);
        btnAboutMe.setBounds(870, 0, 60, 28);
        btnAboutMe.setText("关于");
        btnAboutMe.addMouseListener(new BtnAboutMeMouseListener(this));
        
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
        
        ScrolledComposite scrollPanel = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        scrollPanel.setBounds(111, 37, 879, 531);
        scrollPanel.setExpandHorizontal(true);
        scrollPanel.setExpandVertical(true);
	}
	
	@Override
	protected void checkSubclass() 
	{
		// Disable the check that prevents subclassing of SWT components
	}
}

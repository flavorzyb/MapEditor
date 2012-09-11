package com.zhuyanbin.mapeditor.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.CCombo;

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
	}

	@Override
	protected void checkSubclass() 
	{
		// Disable the check that prevents subclassing of SWT components
	}
}

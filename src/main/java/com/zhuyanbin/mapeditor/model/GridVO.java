package com.zhuyanbin.mapeditor.model;

import org.eclipse.swt.graphics.Color;

public class GridVO
{
    /**
     * 总画布的宽
     */
    private int _width = 0;
    /**
     * 总画布的高
     */
    private int _height = 0;
    /**
     * 单元格的宽
     */
    private int _cellWidth = 0;
    
    /**
     * 单元格的高
     */
    private int _cellHeight = 0;
    
    /**
     * 划线的颜色
     */
    private Color _color = null;
    
    public GridVO()
    {
    }
    
    public void setWidth(int width)
    {
        _width = width;
    }
    
    public void setHeight(int height)
    {
        _height = height;
    }
    
    public void setCellWidth(int cellWidth)
    {
        _cellWidth = cellWidth;
    }
    
    public void setCellHeight(int cellHeight)
    {
        _cellHeight = cellHeight;
    }
    
    public void setColor(Color color)
    {
        _color = color;
    }
    
    public int getWidth()
    {
        return _width;
    }
    
    public int getHeight()
    {
        return _height;
    }
    
    public int getCellWidth()
    {
        return _cellWidth;
    }
    
    public int getCellHeight()
    {
        return _cellHeight;
    }
    
    public Color getColor()
    {
        return _color;
    }
}

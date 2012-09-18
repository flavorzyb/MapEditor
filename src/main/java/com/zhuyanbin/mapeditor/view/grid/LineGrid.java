package com.zhuyanbin.mapeditor.view.grid;

import org.eclipse.swt.graphics.GC;

import com.zhuyanbin.mapeditor.model.GridVO;

public class LineGrid
{
    private GC _gc = null;
    
    private GridVO _gridvo = null;
    
    public LineGrid(GC gc, GridVO gvo)
    {
        setGC(gc);
        setGridVO(gvo);
    }
    
    private void setGC(GC gc)
    {
        _gc = gc;
    }
    
    private GC getGC()
    {
        return _gc;
    }
    
    private void setGridVO(GridVO gvo)
    {
        _gridvo = gvo;
    }
    
    private GridVO getGridVO()
    {
        return _gridvo;
    }
    
    public void drawGrid()
    {
        GC gc = getGC();
        if (gc instanceof GC)
        {
            gc.setAlpha(160);
            if ((getGridVO() instanceof GridVO) && 
                (0 != getGridVO().getCellWidth()) && 
                (0 != getGridVO().getCellHeight()))
            {
                gc.setForeground(getGridVO().getColor());
                
                int cellWidth = getGridVO().getCellWidth();
                int cellHeight = getGridVO().getCellHeight();
                int width = getGridVO().getWidth();
                int height = getGridVO().getHeight();
                
                int wn = width / cellWidth;
                int hn = height / cellHeight;
                
                for (int i = 0; i < wn; i++)
                {
                    gc.drawLine(i*cellWidth, 0, i*cellWidth, height);
                }
                
                for(int i = 0; i < hn; i++)
                {
                    gc.drawLine(0, i*cellHeight, width, i*cellHeight);
                }
            }
        }
    }
    
    public void free()
    {
        setGC(null);
        setGridVO(null);
    }
}

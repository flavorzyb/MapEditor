package com.zhuyanbin.mapeditor.view.mainwindow;

import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;

import com.zhuyanbin.mapeditor.model.GridVO;
import com.zhuyanbin.mapeditor.view.grid.LineGrid;

public class CanvasPaintListener implements PaintListener
{
    private GridVO _gvo = null;
    
    public CanvasPaintListener(GridVO gvo)
    {
        setGridVO(gvo);
    }
    
    private void setGridVO(GridVO gvo)
    {
        _gvo = gvo;
    }
    
    private GridVO getGridVO()
    {
        return _gvo;
    }
    
    @Override
    public void paintControl(PaintEvent e)
    {
        GC gc = e.gc;
        
        LineGrid lg = new LineGrid(gc, getGridVO());
        lg.drawGrid();
        lg.free();
        lg = null;
        
        gc.dispose();
        gc = null;
    }
    
    public void free()
    {
        setGridVO(null);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhuyanbin.mapeditor.utils;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author flavor
 */
public class ImageFileFilter extends FileFilter
{

    @Override
    public boolean accept(File file) 
    {
        String fileName = file.getAbsolutePath().toLowerCase();
        return (file.isDirectory() || 
                fileName.endsWith(".jpg") || 
                fileName.endsWith(".jpeg") ||
                fileName.endsWith(".png") ||
                fileName.endsWith(".gif"));
    }

    @Override
    public String getDescription() {
        return "Image Document(*.jpg,*.png,*.gif)";
    }
}

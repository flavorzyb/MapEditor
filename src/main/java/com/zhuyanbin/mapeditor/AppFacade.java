/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhuyanbin.mapeditor;

import com.zhuyanbin.mapeditor.command.AboutMeCommand;
import com.zhuyanbin.mapeditor.command.MainCommand;
import org.puremvc.java.patterns.facade.Facade;

/**
 *
 * @author flavor
 */
final public class AppFacade extends Facade
{
    protected AppFacade()
    {
    }
    
    /**
     * 获取AppFacade实例化对象
     * 
     * @return 
     *          The Singleton instance of the AppFacade
     */
    public synchronized static AppFacade getInstance()
    {
        if (null == instance)
        {
            instance = new AppFacade();
        }
        
        return (AppFacade) instance;
    }

    
    /**
     * 初始化控制器
     */
    @Override
    protected void initializeController()
    {
        super.initializeController();
        
        // 注册启动主程序事件
        registerCommand(NotiConst.STARTUP, new MainCommand());
        
        // 注册启动AboutMe事件
        registerCommand(NotiConst.S_COMMAND_ABOUTME_OPEN, new AboutMeCommand());
        // 注册关闭AboutMe事件
        registerCommand(NotiConst.S_COMMAND_ABOUTME_CLOSE, new AboutMeCommand());
    }
}

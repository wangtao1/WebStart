package com.mindfind.thread;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
/**
 * Created by Ktao on 9/6/16.
 */
public class MyListenerWay implements ServletContextListener {
    private MyThreadTest myThreadTest;

    public void contextDestroyed(ServletContextEvent e) {
        if (myThreadTest != null && myThreadTest.isInterrupted()) {
            myThreadTest.interrupt();
        }
    }

    public void contextInitialized(ServletContextEvent e) {
        String str = null;
        if (str == null && myThreadTest == null) {
            myThreadTest = new MyThreadTest();
            myThreadTest.start(); // servlet 上下文初始化时启动 socket
        }
    }
}

package com.mindfind.thread;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wangtao on 9/6/16.
 */
public class MyWayServlet extends HttpServlet {

    private MyThreadTest threadTest;

    public MyWayServlet() {}

    public void init(){
        if(threadTest == null) {
            threadTest = new MyThreadTest();
            threadTest.start();
        }
    }

    public void doGet(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
            throws ServletException, IOException {
    }

    public void destory(){
        if (threadTest != null && threadTest.isInterrupted()) {
            threadTest.interrupt();
        }
    }
}

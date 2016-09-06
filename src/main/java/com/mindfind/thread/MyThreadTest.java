package com.mindfind.thread;

/**
 * Created by wangtao on 9/6/16.
 */
public class MyThreadTest extends Thread {
    public void run() {
        while (!this.isInterrupted()) {
            try {
                Thread.sleep(1000); //每隔1000ms执行一次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test begin:" + System.currentTimeMillis());
        }
    }
}

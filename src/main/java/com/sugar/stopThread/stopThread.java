package com.sugar.stopThread;

/**
 * 线程停止
 * @author sugar
 * @date 2022/3/9 13:19
 */
public class stopThread implements Runnable{
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println(i++);
        }
    }

    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) {
        stopThread stopThread = new stopThread();
        new Thread(stopThread).start();
        for (int i = 0; i <= 10000; i++) {
            System.out.println("主线程" + i);
            if (i == 5000) stopThread.stop();
        }
    }
}

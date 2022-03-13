package com.sugar.status.joinThread;

/**
 * 线程强制执行
 * @author sugar
 * @date 2022/3/13 17:51
 */
public class joinThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            System.out.println("我是VIP" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        joinThread joinThread = new joinThread();
        Thread thread = new Thread(joinThread);
        thread.start();

        for (int i = 0; i < 500; i++) {
            if (i == 200) {
                thread.join();
            }
            System.out.println("普通用户" + i);
        }
    }
}

package com.sugar.status.createThread;

/**
 * 实现 Runnable 接口, 重写 run 方法, 丢入线程, 启动线程
 * @author sugar
 * @date 2022/3/6 23:14
 */
public class Thread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程" + i);
        }
    }

    public static void main(String[] args) {
        Thread3 thread3 = new Thread3();
        new Thread(thread3).start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程" + i);
        }

    }
}

package com.sugar.createThread;

/**
 * 继承 Thread 类, 重写 run 方法, start 启动
 * @author sugar
 * @date 2022/3/6 22:47
 */
public class Thread1 extends Thread {
    // 子线程
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程" + i);
        }
    }
    // 主线程
    public static void main(String[] args) {
        // 创建线程对象, 开启线程
        Thread1 thread1 = new Thread1();
        thread1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程" + i);
        }
    }
}
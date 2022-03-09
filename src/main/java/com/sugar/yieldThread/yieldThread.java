package com.sugar.yieldThread;

/**
 * 线程礼让
 * @author sugar
 * @date 2022/3/9 18:42
 */
public class yieldThread {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield,"A").start();
        new Thread(myYield,"B").start();
    }
}

class MyYield implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "线程停止");
    }
}

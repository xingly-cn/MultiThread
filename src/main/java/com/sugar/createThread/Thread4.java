package com.sugar.createThread;

/**
 * 多线程操作同一对象
 * @author sugar
 * @date 2022/3/6 23:24
 */
public class Thread4 implements Runnable {
    private Integer ticket = 10;
    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + "抢到" + ticket--);
        }
    }

    public static void main(String[] args) {
        Thread4 ticket = new Thread4();
        new Thread(ticket,"李大炮").start();
        new Thread(ticket,"王小鸡").start();
        new Thread(ticket,"云小米").start();
    }
}

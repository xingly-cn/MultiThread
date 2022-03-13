package com.sugar.status.stateThread;

/**
 * 观测线程状态
 * @author sugar
 * @date 2022/3/13 18:02
 */
public class stateThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("----------------");
        });
        // 状态
        Thread.State state = t.getState();
        System.out.println(state);  //NEW

        // 启动
        t.start();
        state = t.getState();
        System.out.println(state);  //RUN

        while (state != Thread.State.TERMINATED) {
            Thread.sleep(100);
            state = t.getState();
            System.out.println(state);
        }
    }
}

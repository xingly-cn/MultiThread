package com.sugar.status.createThread;

/** 
 * 模拟龟兔赛跑
 * @author sugar
 * @date 2022/3/6 23:32
 */
public class Race implements Runnable{

    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            // 模拟兔子休息
            if (Thread.currentThread().getName().equals("兔子") && i % 10 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 判断游戏结束
            if (Over(i)) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "米");
        }
    }

    private boolean Over(int m) {
        if (winner != null) {
            return true;
        }
        if (m == 100) {
            winner = Thread.currentThread().getName();
            System.out.println("胜利者：" + winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}

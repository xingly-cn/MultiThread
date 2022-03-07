package com.sugar.demo_1;

import java.util.concurrent.*;

/**
 * 实现 callable 接口
 * @author sugar
 * @date 2022/3/7 21:55
 */
public class Thread5 implements Callable<Boolean> {
    // 子线程
    @Override
    public Boolean call() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程:" + java.lang.Thread.currentThread().getName() + " " + i);
        }
        return true;
    }
    // 主线程
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread5 t1 = new Thread5();
        Thread5 t2 = new Thread5();
        // 创建服务
        ExecutorService service = Executors.newFixedThreadPool(2);
        // 提交执行
        Future<Boolean> res1 = service.submit(t1);
        Future<Boolean> res2 = service.submit(t2);
        // 获取结果
        boolean result1 =  res1.get();
        boolean result2 =  res2.get();
        // 关闭服务
        service.shutdownNow();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程" + i);
        }
    }
}

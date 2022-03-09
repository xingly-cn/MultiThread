package com.sugar.sleepThread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 线程休眠
 * @author sugar
 * @date 2022/3/9 18:28
 */
public class thread{
    public static void main(String[] args) throws InterruptedException {
        Date start = new Date(System.currentTimeMillis());
        while(true) {
            Thread.sleep(1000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(start));
            start = new Date(System.currentTimeMillis());
        }
    }
}

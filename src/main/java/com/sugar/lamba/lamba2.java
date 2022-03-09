package com.sugar.lamba;

/** 
 * 推导 lambda 表达式2 带参
 * @author sugar
 * @date 2022/3/9 12:46
 */
public class lamba2 {
    public static void main(String[] args) {
        Api2 my = null;

        my = a -> System.out.println("你好" + a);
        my.sayHi("阿斗");
    }
}

interface Api2 {
    void sayHi(String r);
}

package com.sugar.lamba;

/**
 * 推导 lambda 表达式
 * @author sugar
 * @date 2022/3/7 22:34
 */
public class lamba1 {
    // 3、静态内部类
    static class  Sugar2 implements Api {
        @Override
        public void sayHello() {
            System.out.println("你好世界");
        }
    }

    public static void main(String[] args) {
        Api sugar = new Sugar();
        sugar.sayHello();

        sugar = new Sugar2();
        sugar.sayHello();

        // 4、局部内部类
        class  Sugar3 implements Api {
            @Override
            public void sayHello() {
                System.out.println("你好世界");
            }
        }
        sugar = new Sugar3();
        sugar.sayHello();

        // 5、匿名内部类
        sugar = new Api() {
            @Override
            public void sayHello() {
                System.out.println("你好世界");
            }
        };

        // 6、lambda 表达式
        sugar = () -> {
            System.out.println("你好世界");
        };
        sugar.sayHello();
    }
}

// 1、定义函数式接口
interface Api {
    void sayHello();
}

// 2、实现类
class  Sugar implements Api {
    @Override
    public void sayHello() {
        System.out.println("你好世界");
    }
}
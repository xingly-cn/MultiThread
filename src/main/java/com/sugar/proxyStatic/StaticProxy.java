package com.sugar.proxyStatic;

public class StaticProxy {
    public static void main(String[] args) {
        Weddings weddings = new Weddings(new You());
        weddings.goMarry();
    }
}

interface Marry {
    void goMarry();
}
// 真实角色
class You implements Marry {
    @Override
    public void goMarry() {
        System.out.println("开始结婚");
    }
}
// 代理角色
class Weddings implements Marry {
    private final Marry target;
    public Weddings (Marry target) {
        this.target = target;
    }
    @Override
    public void goMarry() {
        System.out.println("结婚前的事情...");
        this.target.goMarry();
        System.out.println("结婚后的事情...");
    }
}

package com.sugar.createThread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 【实战练习】多线程下载
 * @author sugar
 * @date 2022/3/6 22:59
 */
public class Thread2 extends Thread{

    private String url;
    private String name;

    public Thread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        DownloadManager manager = new DownloadManager();
        manager.download(url,name);
        System.out.println("文件下载完毕:" + name);
    }

    public static void main(String[] args) {
        Thread2 thread1 = new Thread2("https://tse1-mm.cn.bing.net/th/id/R-C.901f8ebdab22d065baefeae6c2701cc0?rik=Z3Hew18zFaF%2bLQ&riu=http%3a%2f%2fwww.pp3.cn%2fuploads%2f20120418lw%2f13.jpg&ehk=Es5ZGH90h%2foCghvlIwdKfUiqpO05gLSgOEBU2i0Mwok%3d&risl=&pid=ImgRaw&r=0","pic1.jpg");
        Thread2 thread2 = new Thread2("https://tse4-mm.cn.bing.net/th/id/OIP-C.nfC2tVNM9TgwQ5QuqECd6wHaFj?pid=ImgDet&rs=1","pic2.jpg");
        Thread2 thread3 = new Thread2("https://tse1-mm.cn.bing.net/th/id/R-C.83253bf5007cd3cf05c315a8f3d0820b?rik=SDH41OT6GjdmlQ&riu=http%3a%2f%2fwww.desktx.com%2fd%2ffile%2fwallpaper%2fscenery%2f20170215%2ff2d0a76c4d45e7255022f3c511e8bd7a.jpg&ehk=St4XCEEUbOi7HWL7L77WZEyZp096qDgXF070s0sw3Lg%3d&risl=&pid=ImgRaw&r=0","pic3.jpg");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

// 下载器
class DownloadManager {
    public void download(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            System.out.println("IO异常");
        }
    }
}

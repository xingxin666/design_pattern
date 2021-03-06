package com.xingxin.learn.designpattern.singleton.lazy;

/**
 * 简单懒汉式单例
 * 在外部需要使用的时候才进行实例化
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午5:04
 * @version: V1.0
 */
public class LazySimpleSingleton {
    /**
     * 静态块，公共内存区域
     */
    private static LazySimpleSingleton INSTANCE = null;

    private LazySimpleSingleton() {
    }

    /**
     * 无锁，线程不安全
     * @return
     */
    public static LazySimpleSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySimpleSingleton();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Runnable run = () -> {
            LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        };

        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        thread1.start();
        thread2.start();
        System.out.println("---end");
    }
}

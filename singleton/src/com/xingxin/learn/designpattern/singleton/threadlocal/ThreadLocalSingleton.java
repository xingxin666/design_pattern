package com.xingxin.learn.designpattern.singleton.threadlocal;

/**
 * ThreadLocal单例
 * 单个线程中是唯一的，天生的线程安全
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午7:18
 * @version: V1.0
 */
public class ThreadLocalSingleton {
    private static ThreadLocal<ThreadLocalSingleton> threadLocalSingletonThreadLocal = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {

    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocalSingletonThreadLocal.get();
    }

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Runnable run = () -> {
            System.out.println(ThreadLocalSingleton.getInstance());
        };
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        thread1.start();
        thread2.start();
    }
}

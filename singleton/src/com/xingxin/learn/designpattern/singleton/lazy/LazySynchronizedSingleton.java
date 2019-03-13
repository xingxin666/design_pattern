/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午5:04
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xingxin.learn.designpattern.singleton.lazy;

/**
 * 简单懒汉式单例
 * 在外部需要使用的时候才进行实例化
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午5:04
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/13 下午5:04
 */
public class LazySynchronizedSingleton {
    /**
     * 静态块，公共内存区域
     */
    private static LazySynchronizedSingleton INSTANCE = null;

    private LazySynchronizedSingleton() {
    }

    /**
     * 加锁，线程安全，但性能低
     * @return
     */
    public static synchronized LazySynchronizedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySynchronizedSingleton();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Runnable run = () -> {
            LazySynchronizedSingleton instance = LazySynchronizedSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        };

        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        thread1.start();
        thread2.start();
        System.out.println("---end");
    }
}

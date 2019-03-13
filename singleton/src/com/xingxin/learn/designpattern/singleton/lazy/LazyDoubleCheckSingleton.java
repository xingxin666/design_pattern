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
public class LazyDoubleCheckSingleton {
    /**
     * 静态块，公共内存区域
     * volatile 解决jvm指令重排序问题
     */
    private static volatile LazyDoubleCheckSingleton INSTANCE = null;

    private LazyDoubleCheckSingleton() {
    }

    /**
     * 双重检查锁，线程安全，性能高
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyDoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Runnable run = () -> {
            LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        };

        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        thread1.start();
        thread2.start();
        System.out.println("---end");

        int loops = 1000000;
        //LazySimpleSingleton耗时
        long begin = System.currentTimeMillis();
        for(int i = 0 ;i<loops;i++){
            LazySimpleSingleton.getInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println("LazySimpleSingleton耗时："+(end -begin));

        //LazySynchronizedSingleton耗时
        begin = System.currentTimeMillis();
        for(int i = 0 ;i<loops;i++){
            LazySynchronizedSingleton.getInstance();
        }
        end = System.currentTimeMillis();
        System.out.println("LazySynchronizedSingleton耗时："+(end -begin));

        //LazyDoubleCheckSingleton耗时
        begin = System.currentTimeMillis();
        for(int i = 0 ;i<loops;i++){
            LazyDoubleCheckSingleton.getInstance();
        }
        end = System.currentTimeMillis();
        System.out.println("LazyDoubleCheckSingleton耗时："+(end -begin));
    }
}

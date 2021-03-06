package com.xingxin.learn.designpattern.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * 反射破坏单例
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午6:19
 * @version: V1.0
 */
public class ReflectBreakSingletonTest {
    public static void main(String[] args) {
        try {
            //利用反射破坏单例
            Class clazz = LazyInnerClassSingleton.class;
            //通过反射获取私有构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //强制访问
            c.setAccessible(true);
            //暴力初始化
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Class clazz = LazyDoubleCheckSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Class clazz = LazySynchronizedSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

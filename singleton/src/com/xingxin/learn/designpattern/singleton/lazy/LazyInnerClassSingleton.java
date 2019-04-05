package com.xingxin.learn.designpattern.singleton.lazy;

/**
 * 静态内部类懒加载单例
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午6:11
 * @version: V1.0
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
        if (InnerClass.INSTANCE != null) {
            throw new RuntimeException("不允许创建多个实例！");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        //在返回结果前，一定会先加载内部类
        return InnerClass.INSTANCE;
    }

    /**
     * 默认不加载
     */
    private static class InnerClass {
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}

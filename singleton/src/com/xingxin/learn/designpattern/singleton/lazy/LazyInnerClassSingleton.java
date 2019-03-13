/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午6:11
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xingxin.learn.designpattern.singleton.lazy;

/**
 * 静态内部类懒加载单例
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午6:11
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/13 下午6:11
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

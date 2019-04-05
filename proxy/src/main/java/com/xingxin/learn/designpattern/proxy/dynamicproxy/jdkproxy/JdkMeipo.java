package com.xingxin.learn.designpattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 媒婆-jdk动态代理
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午9:04
 */
public class JdkMeipo implements InvocationHandler {
    private Object target;

    public JdkMeipo(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("我是媒婆：我要给你找对象，要找什么样的？");
    }

    private void after() {
        System.out.println("已经找到，准备相亲吧。");
    }
}

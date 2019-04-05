package com.xingxin.learn.designpattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 媒婆-cglib动态代理
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午9:46
 */
public class CglibMeipo implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
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

package com.xingxin.learn.designpattern.proxy.dynamicproxy.myproxy;

import java.lang.reflect.Method;

/**
 * 自定义InvocationHandler
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午10:14
 */
public interface MyInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}

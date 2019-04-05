package com.xingxin.learn.designpattern.proxy.simpleproxy;

/**
 * 被代理对象
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午7:43
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("--doSomething--");
    }
}

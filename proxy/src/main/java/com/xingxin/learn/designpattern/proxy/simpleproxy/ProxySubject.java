package com.xingxin.learn.designpattern.proxy.simpleproxy;

/**
 * 代理类
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午7:45
 */
public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doSomething() {
        before();
        this.subject.doSomething();
        after();
    }

    private void before() {
        System.out.println("---before---");
    }

    private void after() {
        System.out.println("---after---");
    }
}

package com.xingxin.learn.designpattern.proxy.simpleproxy;

/**
 * 客户端测试类
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午7:48
 */
public class Client {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subject = new ProxySubject(realSubject);
        subject.doSomething();
    }
}

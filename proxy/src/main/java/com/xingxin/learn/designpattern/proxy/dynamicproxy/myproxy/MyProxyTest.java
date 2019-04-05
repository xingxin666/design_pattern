package com.xingxin.learn.designpattern.proxy.dynamicproxy.myproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * 测试类
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午10:35
 */
public class MyProxyTest {
    public static void main(String[] args) {
        MyMeipo myMeipo = new MyMeipo(new Customer());
        Person person = (Person) MyProxy.newProxyInstance(new MyClassLoader(), new Class[] { Person.class }, myMeipo);
        System.out.println(person);
        person.findLove();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",
                new Class[] { com.xingxin.learn.designpattern.proxy.dynamicproxy.jdkproxy.Person.class });
        try {
            FileOutputStream fos = new FileOutputStream("/Users/xingxin/$Proxy0.class");
            fos.write(bytes);
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.xingxin.learn.designpattern.proxy.dynamicproxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午9:13
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        JdkMeipo jdkMeipoHandler = new JdkMeipo(new Customer());
        Person proxyPerson = (Person) Proxy
                .newProxyInstance(JdkProxyTest.class.getClassLoader(), new Class[] { Person.class }, jdkMeipoHandler);
        proxyPerson.findLove();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] { Person.class });
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

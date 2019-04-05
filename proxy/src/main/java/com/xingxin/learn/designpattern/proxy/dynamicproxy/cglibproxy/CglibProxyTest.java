package com.xingxin.learn.designpattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午9:56
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        //利用 cglib 的代理类可以将内存中的 class 文件写入本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/xingxin/cglib_proxy_class/");
        CglibMeipo cglibMeipo = new CglibMeipo();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Customer.class);
        enhancer.setCallback(cglibMeipo);
        Customer customer = (Customer) enhancer.create();
        customer.findLove();
    }
}

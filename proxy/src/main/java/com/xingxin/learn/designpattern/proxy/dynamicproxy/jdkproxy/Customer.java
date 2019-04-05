package com.xingxin.learn.designpattern.proxy.dynamicproxy.jdkproxy;

/**
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午9:12
 */
public class Customer implements Person{
    @Override
    public void findLove() {
        System.out.println("我要找高富帅");
    }
}

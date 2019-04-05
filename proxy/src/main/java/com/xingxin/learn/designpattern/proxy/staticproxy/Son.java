package com.xingxin.learn.designpattern.proxy.staticproxy;

/**
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午8:53
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子要求：白富美");
    }
}

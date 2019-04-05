package com.xingxin.learn.designpattern.proxy.staticproxy;

/**
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午8:57
 */
public class Test {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}

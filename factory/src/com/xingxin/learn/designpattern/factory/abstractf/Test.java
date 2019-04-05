package com.xingxin.learn.designpattern.factory.abstractf;

/**
 * test
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午6:11
 * @version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        ICourceFactory factory = new JavaCourceFactory();
        factory.createNote().write();
        factory.createVideo().record();

        factory = new PythonCourceFactory();
        factory.createVideo().record();
        factory.createNote().write();
    }
}

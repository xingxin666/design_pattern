package com.xingxin.learn.designpattern.factory;

/**
 * java课程
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:01
 * @version: V1.0
 */
public class JavaCourse implements ICourse {
    @Override
    public void lean() {
        System.out.println("学习java课程");
    }
}

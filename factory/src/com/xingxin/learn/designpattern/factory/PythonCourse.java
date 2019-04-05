package com.xingxin.learn.designpattern.factory;

/**
 * python课程
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:03
 * @version: V1.0
 */
public class PythonCourse implements ICourse{
    @Override
    public void lean() {
        System.out.println("学习python课程");
    }
}

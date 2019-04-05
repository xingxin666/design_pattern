package com.xingxin.learn.designpattern.factory.method;

import com.xingxin.learn.designpattern.factory.ICourse;

/**
 * test
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:36
 * @version: V1.0
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
        course.lean();

        factory = new PythonCourseFactory();
        course = factory.create();
        course.lean();
    }
}

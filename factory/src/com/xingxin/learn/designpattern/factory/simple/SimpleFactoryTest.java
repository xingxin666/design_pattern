package com.xingxin.learn.designpattern.factory.simple;

import com.xingxin.learn.designpattern.factory.ICourse;
import com.xingxin.learn.designpattern.factory.JavaCourse;

/**
 * 测试
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:04
 * @version: V1.0
 */
public class SimpleFactoryTest {
    //1
    /*public static void main(String[] args) {
        ICourse course = new JavaCourse();
        course.lean();
    }*/

    //2
    /*public static void main(String[] args) {
        CourceFactory factory = new CourceFactory();
        ICourse course = factory.create("java");
        course.lean();
    }*/

    //3
    /*public static void main(String[] args) {
        CourceFactory factory = new CourceFactory();
        ICourse course = factory.createByClassName("com.xingxin.learn.designpattern.factory.JavaCourse");
        course.lean();
    }*/

    //4
    public static void main(String[] args) {
        CourceFactory factory = new CourceFactory();
        ICourse course = factory.createByClassType(JavaCourse.class);
        course.lean();
    }
}

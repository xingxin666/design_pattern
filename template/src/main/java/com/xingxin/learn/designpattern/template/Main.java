package com.xingxin.learn.designpattern.template;

/**
 * test
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/9 下午6:46
 */
public class Main {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        PythonCourse pythonCourse = new PythonCourse(true);
        pythonCourse.createCourse();
    }
}

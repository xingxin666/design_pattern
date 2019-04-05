package com.xingxin.learn.designpattern.factory.simple;

import com.xingxin.learn.designpattern.factory.ICourse;
import com.xingxin.learn.designpattern.factory.JavaCourse;
import com.xingxin.learn.designpattern.factory.PythonCourse;

/**
 * 课程工厂类
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:08
 * @version: V1.0
 */
public class CourceFactory {
    public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        }
        return null;
    }

    public ICourse createByClassName(String className) {
        if (className == null || "".equals(className)) {
            return null;
        }
        try {
            return (ICourse) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ICourse createByClassType(Class<? extends ICourse> classType) {
        if (classType == null) {
            return null;
        }
        try {
            return classType.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

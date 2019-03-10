/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:08
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
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
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/10 下午5:08
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

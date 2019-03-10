/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:36
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xingxin.learn.designpattern.factory.method;

import com.xingxin.learn.designpattern.factory.ICourse;

/**
 * test
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:36
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/10 下午5:36
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

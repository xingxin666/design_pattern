/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:04
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xingxin.learn.designpattern.factory.simple;

import com.xingxin.learn.designpattern.factory.ICourse;
import com.xingxin.learn.designpattern.factory.JavaCourse;

/**
 * 测试
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:04
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/10 下午5:04
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

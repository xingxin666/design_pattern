/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:03
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xingxin.learn.designpattern.factory;

/**
 * python课程
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:03
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/10 下午5:03
 */
public class PythonCourse implements ICourse{
    @Override
    public void lean() {
        System.out.println("学习python课程");
    }
}

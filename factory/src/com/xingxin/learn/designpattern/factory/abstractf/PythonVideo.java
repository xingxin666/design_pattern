/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午6:01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xingxin.learn.designpattern.factory.abstractf;

/**
 * python视频
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午6:01
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/10 下午6:01
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制python");
    }
}

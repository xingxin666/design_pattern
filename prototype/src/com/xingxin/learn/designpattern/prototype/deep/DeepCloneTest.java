/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午6:25
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xingxin.learn.designpattern.prototype.deep;

/**
 * DeepCloneTest
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午6:25
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/23 下午6:25
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng s = new QiTianDaSheng();
        QiTianDaSheng sClone = (QiTianDaSheng) s.clone();
        System.out.println("深克隆：" + (s.getJinGuBang() == sClone.getJinGuBang()));

        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng qClone = q.shadowClone();
        System.out.println("浅克隆：" + (q.getJinGuBang() == qClone.getJinGuBang()));
    }
}

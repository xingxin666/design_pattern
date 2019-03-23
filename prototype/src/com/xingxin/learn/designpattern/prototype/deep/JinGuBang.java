/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午6:10
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xingxin.learn.designpattern.prototype.deep;

import java.io.Serializable;

/**
 * JinGuBang
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午6:10
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/23 下午6:10
 */
public class JinGuBang implements Serializable {
    public int h = 100;
    public int d = 10;

    public void big() {
        this.h = this.h * 2;
        this.d = this.d * 2;
    }

    public void small() {
        this.h = this.h / 2;
        this.d = this.d / 2;

    }
}

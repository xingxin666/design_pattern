package com.xingxin.learn.designpattern.prototype.deep;

/**
 * DeepCloneTest
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午6:25
 * @version: V1.0
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

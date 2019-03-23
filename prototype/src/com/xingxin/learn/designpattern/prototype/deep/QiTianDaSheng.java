/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午6:13
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xingxin.learn.designpattern.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * QiTianDaSheng
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午6:13
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/23 下午6:13
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    private JinGuBang jinGuBang;

    public QiTianDaSheng() {
        super.setBirthday(new Date());
        jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() {
        return deepClone();
    }

    private Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng qiTianDaSheng = (QiTianDaSheng) ois.readObject();
            qiTianDaSheng.setBirthday(new Date());
            return qiTianDaSheng;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public QiTianDaSheng shadowClone() {
        QiTianDaSheng copy = new QiTianDaSheng();
        copy.setBirthday(new Date());
        copy.setJinGuBang(this.jinGuBang);
        copy.setWeight(this.getWeight());
        copy.setHeight(this.getHeight());
        return copy;
    }

    public JinGuBang getJinGuBang() {
        return jinGuBang;
    }

    public void setJinGuBang(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }
}

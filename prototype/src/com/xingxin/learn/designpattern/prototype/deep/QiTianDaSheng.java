package com.xingxin.learn.designpattern.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * QiTianDaSheng
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午6:13
 * @version: V1.0
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

package com.xingxin.learn.designpattern.prototype.deep;

/**
 * Monkey
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午6:08
 * @version: V1.0
 */

import java.util.Date;

public class Monkey {
    private int weight;
    private int height;
    private Date birthday;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

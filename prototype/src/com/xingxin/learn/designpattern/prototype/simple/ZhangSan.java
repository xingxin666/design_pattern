package com.xingxin.learn.designpattern.prototype.simple;

import java.util.List;

/**
 * ZhangSan
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午5:37
 * @version: V1.0
 */
public class ZhangSan implements Person {
    private int age;
    private String name;
    private List hobbies;

    @Override
    public Person clone() {
        ZhangSan zhangSan = new ZhangSan();
        zhangSan.setAge(age);
        zhangSan.setName(name);
        zhangSan.setHobbies(hobbies);
        return zhangSan;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }
}

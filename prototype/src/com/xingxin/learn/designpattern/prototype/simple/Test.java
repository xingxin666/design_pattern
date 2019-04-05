package com.xingxin.learn.designpattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Test浅克隆
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午5:41
 * @version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        ZhangSan zhangSan = new ZhangSan();
        zhangSan.setAge(18);
        zhangSan.setName("zhangsan");
        List hobbies = new ArrayList<>();
        hobbies.add("hobbies1");
        hobbies.add("hobbies2");
        zhangSan.setHobbies(hobbies);

        ZhangSan zhangSanClone = (ZhangSan) zhangSan.clone();

        zhangSanClone.getHobbies().add("hobbies3");

        System.out.println(zhangSan);
        System.out.println(zhangSanClone);

        System.out.println(zhangSan.getHobbies());
        System.out.println(zhangSanClone.getHobbies());
        //引用地址相等证明是浅克隆
        System.out.println(zhangSan.getHobbies() == zhangSanClone.getHobbies());

    }
}

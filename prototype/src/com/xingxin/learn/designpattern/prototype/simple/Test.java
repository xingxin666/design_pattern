/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午5:41
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xingxin.learn.designpattern.prototype.simple;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.ArrayList;
import java.util.List;

/**
 * Test浅克隆
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/23 下午5:41
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/23 下午5:41
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

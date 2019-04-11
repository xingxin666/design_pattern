package com.xingxin.learn.designpattern.adapter;

/**
 * 交流电
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/11 下午5:35
 */
public class Ac220 {
    public int outputAC220V() {
        int output = 220;
        System.out.println("输出交流电" + output + "V");
        return output;
    }
}

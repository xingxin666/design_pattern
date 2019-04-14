package com.xingxin.learn.designpattern.decorator;

/**
 * 煎饼
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/14 下午6:48
 */
public class BaseBattercake implements Battercake{
    @Override
    public String getMsg() {
        return "1个煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}

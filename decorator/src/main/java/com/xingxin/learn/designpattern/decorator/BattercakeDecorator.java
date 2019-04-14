package com.xingxin.learn.designpattern.decorator;

/**
 * 煎饼装饰器
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/14 下午6:49
 */
public class BattercakeDecorator implements Battercake {
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    public String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.battercake.getPrice();
    }
}

package com.xingxin.learn.designpattern.decorator;

/**
 * 加鸡蛋
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/14 下午6:51
 */
public class EggDecorator extends BattercakeDecorator {
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}

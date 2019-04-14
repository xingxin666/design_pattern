package com.xingxin.learn.designpattern.decorator;

/**
 * 加香肠
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/14 下午6:54
 */
public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}

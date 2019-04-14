package com.xingxin.learn.designpattern.decorator;

/**
 * test
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/14 下午6:56
 */
public class Main {
    public static void main(String[] args) {
        Battercake battercake = new BaseBattercake();
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getMsg());
        System.out.println(battercake.getPrice());
    }
}

package com.xingxin.learn.designpattern.strategy.promotion;

/**
 * 返现
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/8 下午4:32
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现2元");
    }
}

package com.xingxin.learn.designpattern.strategy.promotion;

/**
 * 无促销
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/8 下午4:34
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}

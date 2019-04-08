package com.xingxin.learn.designpattern.strategy.promotion;

/**
 * 优惠券
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/8 下午4:31
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("优惠券优惠10元");
    }
}

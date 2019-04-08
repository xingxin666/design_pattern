package com.xingxin.learn.designpattern.strategy.promotion;

/**
 * main
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/8 下午4:43
 */
public class Main {
    public static void main(String[] args) {
        PromotionActivity activity = new PromotionActivity(
                PromotionStrategyFactory.getPromotionStrategy(PromotionStrategyFactory.COUPON));
        activity.execute();

        PromotionActivity activity2 = new PromotionActivity(
                PromotionStrategyFactory.getPromotionStrategy(PromotionStrategyFactory.CASH_BACK));
        activity2.execute();
    }
}

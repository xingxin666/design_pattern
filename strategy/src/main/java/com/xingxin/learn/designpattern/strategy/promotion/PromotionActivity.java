package com.xingxin.learn.designpattern.strategy.promotion;

/**
 * 促销活动
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/8 下午4:36
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        this.promotionStrategy.doPromotion();
    }
}

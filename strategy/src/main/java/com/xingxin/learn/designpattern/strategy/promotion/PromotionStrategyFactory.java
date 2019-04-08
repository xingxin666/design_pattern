package com.xingxin.learn.designpattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * PromotionStrategyFactory
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/8 下午4:38
 */
public class PromotionStrategyFactory {
    public static final String DEFALUT = "empty";
    public static final String CASH_BACK = "cashBack";
    public static final String COUPON = "coupon";

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGE_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGE_MAP.put(DEFALUT, new EmptyStrategy());
        PROMOTION_STRATEGE_MAP.put(CASH_BACK, new CashbackStrategy());
        PROMOTION_STRATEGE_MAP.put(COUPON, new CouponStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String key) {
        return PROMOTION_STRATEGE_MAP.get(key);
    }

}

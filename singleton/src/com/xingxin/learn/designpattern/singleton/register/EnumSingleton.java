package com.xingxin.learn.designpattern.singleton.register;

/**
 * 枚举单例
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午7:05
 * @version: V1.0
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private static EnumSingleton getInstance() {
        return INSTANCE;
    }
}

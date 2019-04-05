package com.xingxin.learn.designpattern.singleton.serializable;

import java.io.Serializable;

/**
 * 序列化的单例
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午6:45
 * @version: V1.0
 */
public class SeriableSingleton implements Serializable {
    private static final SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 增加该方法代码就可以解决反序列化破坏单例的问题
     * @return
     */
    /*private Object readResolve(){
        return INSTANCE;
    }*/
}

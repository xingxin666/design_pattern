/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午6:45
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xingxin.learn.designpattern.singleton.serializable;

import java.io.Serializable;

/**
 * 序列化的单例
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午6:45
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/13 下午6:45
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

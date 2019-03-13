/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午7:09
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.xingxin.learn.designpattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午7:09
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/13 下午7:09
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        synchronized (ioc) {
            if (ioc.containsKey(className)) {
                return ioc.get(className);
            }
            try {
                Object obj = Class.forName(className).newInstance();
                ioc.put(className, obj);
                return obj;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

    }
}

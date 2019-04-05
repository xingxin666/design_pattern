package com.xingxin.learn.designpattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午7:09
 * @version: V1.0
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

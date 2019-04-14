package com.xingxin.learn.designpattern.observer;

/**
 * 观察者类
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/14 下午8:21
 */
public class ObserverClass implements Observer {
    private String name;

    public ObserverClass(String name) {
        this.name = name;
    }

    @Override
    public void update(Object obj) {
        System.out.println(name + "收到消息:" + obj);
    }
}

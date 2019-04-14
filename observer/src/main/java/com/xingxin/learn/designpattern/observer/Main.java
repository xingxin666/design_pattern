package com.xingxin.learn.designpattern.observer;

/**
 * test
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/14 下午8:24
 */
public class Main {
    public static void main(String[] args) {
        ObserverClass observerClass1 = new ObserverClass("张三");
        ObserverClass observerClass2 = new ObserverClass("李四");

        ObservableClass observableClass = new ObservableClass();
        observableClass.addObserver(observerClass1);
        observableClass.addObserver(observerClass2);
        observableClass.setMessage("你好");
    }
}

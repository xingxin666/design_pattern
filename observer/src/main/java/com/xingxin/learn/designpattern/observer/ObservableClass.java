package com.xingxin.learn.designpattern.observer;

/**
 * 被观察者类
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/14 下午8:19
 */
public class ObservableClass extends Observable {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        super.setChanged();
        super.notifyAllObservers(message);
    }
}

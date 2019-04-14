package com.xingxin.learn.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/14 下午8:08
 */
public class Observable {
    private boolean changed = false;
    private List<Observer> obs = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.obs.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.obs.remove(observer);
    }

    public void notifyAllObservers(Object object) {
        if (!hasChanged()) {
            return;
        }
        clearChanged();
        for (Observer observer : obs) {
            observer.update(object);
        }
    }

    public void setChanged() {
        changed = true;
    }

    public void clearChanged() {
        changed = false;
    }

    public boolean hasChanged() {
        return changed;
    }
}

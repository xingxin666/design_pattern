package com.xingxin.learn.designpattern.factory.abstractf;

/**
 * java课程工厂
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午6:03
 * @version: V1.0
 */
public class JavaCourceFactory implements ICourceFactory{
    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }
}

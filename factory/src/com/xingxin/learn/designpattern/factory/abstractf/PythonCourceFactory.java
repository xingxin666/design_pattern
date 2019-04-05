package com.xingxin.learn.designpattern.factory.abstractf;

/**
 * PythonCourceFactory
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午6:06
 * @version: V1.0
 */
public class PythonCourceFactory implements ICourceFactory {
    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }
}

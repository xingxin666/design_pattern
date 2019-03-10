package com.xingxin.learn.designpattern.factory.abstractf;

/**
 * 课程工厂
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:56
 * @version: V1.0
 * @review: xing_xin[xing_xin@suixingpay.com]/2019/3/10 下午5:56
 */
public interface ICourceFactory {
    IVideo createVideo();

    INote createNote();

}

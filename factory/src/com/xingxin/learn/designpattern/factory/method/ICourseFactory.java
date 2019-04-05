package com.xingxin.learn.designpattern.factory.method;

import com.xingxin.learn.designpattern.factory.ICourse;

/**
 * 课程工厂接口
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:30
 * @version: V1.0
 */
public interface ICourseFactory {
    ICourse create();
}

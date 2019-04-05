package com.xingxin.learn.designpattern.factory.abstractf;

/**
 * python视频
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午6:01
 * @version: V1.0
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制python");
    }
}

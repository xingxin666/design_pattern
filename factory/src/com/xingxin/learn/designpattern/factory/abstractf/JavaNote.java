package com.xingxin.learn.designpattern.factory.abstractf;

/**
 * java笔记
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/10 下午5:57
 * @version: V1.0
 */
public class JavaNote implements INote{
    @Override
    public void write() {
        System.out.println("写java笔记");
    }
}

package com.xingxin.learn.designpattern.adapter;

/**
 * test
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/11 下午5:42
 */
public class Main {
    public static void main(String[] args) {
        Dc5 dc5 = new PowerAdapter(new Ac220());
        dc5.outputDC5V();
    }
}

package com.xingxin.learn.designpattern.adapter;

/**
 * 电源适配器
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/11 下午5:38
 */
public class PowerAdapter implements Dc5 {
    private Ac220 ac220;

    public PowerAdapter(Ac220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int input = ac220.outputAC220V();
        int output = input / 44;
        System.out.println("输入" + input + "V，输出" + output + "V");
        return output;
    }
}

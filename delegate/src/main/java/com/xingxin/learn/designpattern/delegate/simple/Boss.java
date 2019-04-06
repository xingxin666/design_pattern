package com.xingxin.learn.designpattern.delegate.simple;

/**
 * Boss
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/6 下午2:56
 */
public class Boss {

    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}

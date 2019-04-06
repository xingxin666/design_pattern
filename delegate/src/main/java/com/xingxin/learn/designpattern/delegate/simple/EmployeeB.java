package com.xingxin.learn.designpattern.delegate.simple;

/**
 * 员工B
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/6 下午2:51
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我开始干" + command);
    }
}

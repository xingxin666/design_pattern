package com.xingxin.learn.designpattern.delegate.simple;

/**
 * 员工A
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/6 下午2:49
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我开始干" + command);
    }
}

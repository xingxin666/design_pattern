package com.xingxin.learn.designpattern.template;

/**
 * java课
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/9 下午6:42
 */
public class JavaCourse extends NetworkCourse {
    @Override
    void postHomework() {
        System.out.println("布置java作业");
    }

    @Override
    protected boolean isNeedHomework() {
        return super.isNeedHomework();
    }
}

package com.xingxin.learn.designpattern.template;

/**
 * Python课程
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/9 下午6:44
 */
public class PythonCourse extends NetworkCourse {
    private boolean isNeedHomework = false;

    public PythonCourse(boolean isNeedHomework) {
        this.isNeedHomework = isNeedHomework;
    }

    @Override
    void postHomework() {
        System.out.println("布置python作业");
    }

    @Override
    protected boolean isNeedHomework() {
        return isNeedHomework;
    }
}

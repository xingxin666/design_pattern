package com.xingxin.learn.designpattern.template;

/**
 * 网课
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/9 下午6:32
 */
public abstract class NetworkCourse {
    protected final void createCourse() {
        //1.发预习材料
        this.postPreResource();
        //2.创建PPT
        this.createPpt();
        //3.直播课程
        this.liveVideo();
        //4.提交笔记
        this.postNote();
        //5.提交源码
        this.postSourceCode();
        //6.布置作业
        if (this.isNeedHomework()) {
            this.postHomework();
        }
    }

    private void postPreResource() {
        System.out.println("发预习材料");
    }

    private void createPpt() {
        System.out.println("创建PPT");
    }

    private void liveVideo() {
        System.out.println("直播课程");
    }

    private void postNote() {
        System.out.println("提交笔记");
    }

    private void postSourceCode() {
        System.out.println("提交源码");
    }

    abstract void postHomework();

    /**
     * 钩子方法
     *
     * @return
     */
    protected boolean isNeedHomework() {
        return false;
    }
}

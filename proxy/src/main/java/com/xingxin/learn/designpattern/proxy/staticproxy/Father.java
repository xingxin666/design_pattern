package com.xingxin.learn.designpattern.proxy.staticproxy;

/**
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午8:54
 */
public class Father implements Person {
    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    @Override
    public void findLove() {
        System.out.println("开始帮儿子找对象");
        this.person.findLove();
        System.out.println("成功帮儿子找到对象");
    }
}

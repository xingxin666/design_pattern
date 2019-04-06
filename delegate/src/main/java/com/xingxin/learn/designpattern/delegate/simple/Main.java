package com.xingxin.learn.designpattern.delegate.simple;

/**
 * test
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/6 下午2:57
 */
public class Main {
    /**
     * /客户请求(Boss)、委派者(Leader)、被被委派者(Target)
     * //委派者要持有被委派者的引用
     * //代理模式注重的是过程， 委派模式注重的是结果
     * //策略模式注重是可扩展(外部扩展)，委派模式注重内部的灵活和复用
     * //委派的核心:就是分发、调度、派遣
     * //委派模式:就是静态代理和策略模式一种特殊的组合
     * @param args
     */
    public static void main(String[] args) {
        Leader leader = new Leader();
        Boss boss = new Boss();
        boss.command("登录", leader);
        boss.command("注册", leader);
    }
}

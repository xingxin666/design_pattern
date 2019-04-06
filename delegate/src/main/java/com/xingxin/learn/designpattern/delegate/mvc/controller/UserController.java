package com.xingxin.learn.designpattern.delegate.mvc.controller;

/**
 * UserController
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/6 下午3:00
 */
public class UserController {

    public String getUserNameById(String id){
        return "张三,id="+id;
    }

    public String getUsers(){
        return "用户列表";
    }
}

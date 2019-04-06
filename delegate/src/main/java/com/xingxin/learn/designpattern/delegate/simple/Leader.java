package com.xingxin.learn.designpattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * leader
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/6 下午2:52
 */
public class Leader {

    private Map<String, IEmployee> targets = new HashMap<>();

    public Leader() {
        targets.put("登录", new EmployeeA());
        targets.put("注册", new EmployeeB());
    }

    public void doing(String command) {
        targets.get(command).doing(command);
    }
}

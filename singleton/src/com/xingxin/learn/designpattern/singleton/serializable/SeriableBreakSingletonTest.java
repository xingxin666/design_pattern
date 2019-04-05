package com.xingxin.learn.designpattern.singleton.serializable;

import java.io.*;

/**
 * 序列化破坏单例
 *
 * @author: xing_xin[xing_xin@suixingpay.com]
 * @date: 2019/3/13 下午6:49
 * @version: V1.0
 */
public class SeriableBreakSingletonTest {
    public static void main(String[] args) throws Exception {
        SeriableSingleton s1 = SeriableSingleton.getInstance();
        SeriableSingleton s2 = null;
        String fileName = "Serialble.obj";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        s2 = (SeriableSingleton) ois.readObject();
        ois.close();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}

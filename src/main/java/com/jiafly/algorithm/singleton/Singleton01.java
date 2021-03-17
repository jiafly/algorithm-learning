package com.jiafly.algorithm.singleton;

/**
 * 单例 之 饿汉模式实现
 * 私有实例，私有构造，提供对外访问方法
 *
 * @author liuyi
 */
public class Singleton01 {

    private static Singleton01 instance = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return instance;
    }
}
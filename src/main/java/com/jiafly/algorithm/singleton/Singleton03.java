package com.jiafly.algorithm.singleton;

/**
 * 单例 之 懒汉模式实现（线程安全）
 * 私有实例，私有构造，提供对外访问方法
 *
 * @author liuyi
 */
public class Singleton03 {

    private static Singleton03 instance = null;

    private Singleton03() {
    }

    public static synchronized Singleton03 getInstance() {
        if ((instance == null)) {
            instance = new Singleton03();
        }
        return instance;
    }
}
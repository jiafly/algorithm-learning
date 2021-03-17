package com.jiafly.algorithm.singleton;

/**
 * 单例 之 懒汉模式实现（线程不安全）
 * 私有实例，私有构造，提供对外访问方法
 *
 * @author liuyi
 */
public class Singleton02 {

    private static Singleton02 instance = null;

    private Singleton02() {
    }

    public Singleton02 getInstance() {
        if ((instance == null)) {
            instance = new Singleton02();
        }
        return instance;
    }
}
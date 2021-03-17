package com.jiafly.algorithm.singleton;

/**
 * 单例 之 双重锁校验实现
 * 私有实例，私有构造，提供对外访问方法
 *
 * @author liuyi
 */
public class Singleton04 {

    private volatile static Singleton04 instance = null;

    private Singleton04() {
    }

    public static synchronized Singleton04 getInstance() {
        if (instance == null) {
            synchronized (Singleton04.class) {
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }

}
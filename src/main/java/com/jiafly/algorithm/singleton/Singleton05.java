package com.jiafly.algorithm.singleton;

/**
 * 单例 之 静态内部类实现
 * 私有实例，私有构造，提供对外访问方法
 *
 * @author liuyi
 */
public class Singleton05 {

    private static class Singleton {
        private static final Singleton05 instance = new Singleton05();
    }

    private Singleton05() {
    }

    public static Singleton05 getInstance() {
        return Singleton.instance;
    }


}

package com.jiafly.algorithm.singleton;

/**
 * 单例 之 枚举实现
 *
 * @author dongxie
 */
public class Singleton06 {

    private Singleton06() {
    }

    /**
     * 枚举类型是线程安全的，并且只会装载一次
     */
    private enum Singleton {
        /**
         * 实例
         */
        INSTANCE;
        private final Singleton06 instance;

        Singleton() {
            instance = new Singleton06();
        }

        private Singleton06 getInstance() {
            return instance;
        }
    }

    public static Singleton06 getInstance() {

        return Singleton.INSTANCE.getInstance();
    }
}
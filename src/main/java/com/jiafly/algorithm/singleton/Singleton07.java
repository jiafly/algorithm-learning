package com.jiafly.algorithm.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 单例 之 容器实现
 * 私有实例，私有构造，提供对外访问方法
 *
 * @author liuyi
 */
public class Singleton07 {

    private Singleton07() {
    }

    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (Objects.nonNull(key) && Objects.equals(key, "") && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}

package com.jiafly.algorithm.utils;

import org.springframework.stereotype.Component;

/**
 * 代码执行时间计算工具类
 *
 * @author liuyi
 */
@Component
public class ExecutionTimeUtil {

    public static long startTime, endTime, startMemory, endMemory;

    public static void start() {
        startTime = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        startMemory = runtime.totalMemory() - runtime.freeMemory();
    }

    public static void end() {
        endTime = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        endMemory = runtime.totalMemory() - runtime.freeMemory();

        // 计算start和end之间的代码执行期间所耗时间(ms)与内存(M)。
        String time = String.valueOf((double) (endTime - startTime) / 1000000);
        String memory = String.valueOf((double) (endMemory - startMemory) / 1024 / 1024);
        System.out.println("---------------代码执行时间为：" + time.substring(0, "0.0".equals(time) ? 1 : (time.indexOf(".") + 3)) + " ms, 消耗内存：" + memory.substring(0, "0.0".equals(memory) ? 1 : (memory.indexOf(".") + 3)) + " M + !---------------");
    }
}

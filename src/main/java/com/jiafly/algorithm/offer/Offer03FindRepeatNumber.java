package com.jiafly.algorithm.offer;

import com.jiafly.algorithm.utils.ExecutionTimeUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * 【题目】剑指 Offer 03. 数组中重复的数字
 * <p>
 * 【描述】在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 【限制】2 <= n <= 100000
 * <p>
 * 【示例】
 * 输入：[2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 * @author liuyi
 */
public class Offer03FindRepeatNumber {

    /**
     * 方法一：空间换时间
     *
     * @param nums 数组
     * @return 重复数字
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

    /**
     * 方法二：原地置换
     *
     * @param nums 数组
     * @return 重复数字
     */
    public int findRepeatNumber2(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        ExecutionTimeUtil.start();
        int[] nums = {1, 5, 3, 5, 2, 6, 8, 0, 0};
        Offer03FindRepeatNumber number = new Offer03FindRepeatNumber();
        System.out.println(number.findRepeatNumber(nums));
        ExecutionTimeUtil.end();
    }

}

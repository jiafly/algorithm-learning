package com.jiafly.algorithm.offer;

/**
 * 【题目】剑指 Offer 05. 替换空格
 * <p>
 * 【描述】请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 * 【示例】
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * <p>
 * 【限制】0 <= s 的长度 <= 10000
 *
 * @author liuyi
 */
public class Offer05ReplaceSpace {

    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        if (chars.length <= 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        Offer05ReplaceSpace replaceSpace = new Offer05ReplaceSpace();
        System.out.println(replaceSpace.replaceSpace(s));
    }
}

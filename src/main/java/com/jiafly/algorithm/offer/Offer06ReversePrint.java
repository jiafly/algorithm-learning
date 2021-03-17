package com.jiafly.algorithm.offer;

/**
 * 【题目】剑指 Offer 06. 从尾到头打印链表
 * <p>
 * 【描述】输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * 【示例】
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *
 * @author liuyi
 */
public class Offer06ReversePrint {

    static class ListNode {
        private final int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    /**
     * 方法一
     *
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            ++count;
            node = node.next;
        }
        int[] nums = new int[count];
        node = head;
        for (int i = count - 1; i >= 0; --i) {
            nums[i] = node.val;
            node = node.next;
        }
        return nums;
    }

    /**
     * 方法二：递归
     *
     * @param head
     * @return
     */
    public int[] reversePrint2(ListNode head) {
        if (head == null) {
            return new int[]{};
        }
        return reverse(head, 0);
    }

    public int[] reverse(ListNode head, int index) {
        int[] arr;
        if (head.next != null) {
            arr = reverse(head.next, ++index);
            arr[arr.length - index] = head.val;
        } else {
            arr = new int[index + 1];
            arr[0] = head.val;
        }
        return arr;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(3, new ListNode(2, null)));
        Offer06ReversePrint reversePrint = new Offer06ReversePrint();
        reversePrint.reversePrint(head);


    }
}

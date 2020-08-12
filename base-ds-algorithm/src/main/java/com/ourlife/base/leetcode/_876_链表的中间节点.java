package com.ourlife.base.leetcode;

/**
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * @author zhangchao
 * @createdOn 2020/8/12
 */
public class _876_链表的中间节点 {

    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        //链表长度是否是双数  1-2-3-4-5-6
        while (fast != null && fast.next != null) {
          fast = fast.next.next;
          slow = slow.next;
        }
        return slow;
    }
}

package com.wangxingdi.algorithm.leetcode.easy;

import com.wangxingdi.domain.ListNode;

/**
 * 剑指 Offer 22. 链表中倒数第k个节点
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 *
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * 返回链表 4->5.
 */
public class Q0022_GetListNodeFromEnd {

    public static void main(String[] args) {
        Q0022_GetListNodeFromEnd clazz = new Q0022_GetListNodeFromEnd();
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        //同向快慢指针
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1;i<k;i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}

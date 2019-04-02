package com.xx;

/**
 * 24. 两两交换链表中的节点
 */
public class SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dump = new ListNode(0);
        dump.next = head;
        head = dump;
        while (head.next != null && head.next.next != null) {
            ListNode n1 = head.next;
            ListNode n2 = head.next.next;
            head.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            head = n1;
        }
        return dump.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n3.next = n4;
        n2.next = n3;
        n1.next = n2;
        swapPairs(n1);


    }
}

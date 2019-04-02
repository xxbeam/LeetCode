package com.xx;

/**
 * 19. 删除链表的倒数第N个节点
 */
public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode node1 = temp;
        ListNode node2 = temp;
        for (int i = 0; i < n+1; i++) {
            node2 = node2.next;

        }

        while (node2!=null){
            node1 = node1.next;
            node2 = node2.next;
        }
        node1.next = node1.next.next;
        return temp.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        d.next = e;
        c.next = d;
        b.next = c;
        a.next = b;
        System.out.println(removeNthFromEnd(a,2));



    }

}

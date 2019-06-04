package com.xx;

/**
 * 86. 分隔链表
 */
public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while (head!=null){
            if(head.val<x){
                temp1.next = head;
                temp1 = temp1.next;
            }else{
                temp2.next = head;
                temp2 = temp2.next;
            }
            head = head.next;
        }
        temp1.next = head2.next;
        temp2.next = null;
        return head1.next;
    }

}

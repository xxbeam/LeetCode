package com.xx;

/**
 * 83. 删除排序链表中的重复元素
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode nodes = head;
        while (nodes.next!=null){
            int x = nodes.val;
            if(nodes.val==nodes.next.val){
                nodes.next = nodes.next.next;
            }else{
                nodes = nodes.next;
            }
        }
        return head;
    }

}

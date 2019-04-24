package com.xx;

/**
 * 82. 删除排序链表中的重复元素 II
 */
public class RemoveDuplicatesFromSortedListii {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode temp = head;
        ListNode newNode = new ListNode(0);
        ListNode newTemp = newNode;
        Integer num = null;
        while (temp!=null&&temp.next!=null){
            int x = temp.val;
            int y = temp.next.val;
            if(x==y){
                num = x;
                temp = temp.next.next;
            }else{
                if(num!=null&&num==x){
                    num = null;
                    temp = temp.next;
                }else{
                    num = null;
                    newTemp.next = new ListNode(temp.val);
                    newTemp = newTemp.next;
                    temp = temp.next;
                }
            }
        }
        if(temp!=null&&(num==null||(num!=null&&num!=temp.val))){
            newTemp.next = new ListNode(temp.val);
        }
        return newNode.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        System.out.println(new RemoveDuplicatesFromSortedListii().deleteDuplicates(head));
    }

}

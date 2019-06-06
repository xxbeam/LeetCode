package com.xx;

/**
 * 92. 反转链表 II
 */
public class ReverseLinkedListii {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode first = null;
        ListNode reverse = null;
        ListNode reverseEnd = null;
        ListNode next = head;
        ListNode temp = null;
        int count = 0;
        while (next!=null){
            count++;
            if(count>=m&&count<=n){
                if(reverseEnd==null){
                    reverseEnd = next;
                }
                temp = next.next;
                next.next = reverse;
                reverse = next;
                next = temp;
            }else if(count>n){
                break;
            }else{
                first = next;
                next = next.next;
            }
        }
        reverseEnd.next = next;
        if(first==null){
            //从第一个开始反转
            return reverse;
        }else{
            first.next = reverse;
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(5);
        a.next = b;
        new ReverseLinkedListii().reverseBetween(a,1,2);
    }

}

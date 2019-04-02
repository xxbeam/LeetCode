package com.xx;

/**
 * 25. k个一组翻转链表
 */
public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==0||k==1){
            return head;
        }
        if(head==null){
            return null;
        }

        int x = 0;
        ListNode cur = head;
        ListNode check = head;
        ListNode next = null;
        ListNode returnNode = null;
        while (x<k&&check.next!=null){
            x++;
            check = check.next;
        }
        if(x==k){
            for (int i = 0;i<k;i++){
                next = cur.next;
                cur.next = returnNode;
                returnNode = cur;
                cur = next;
            }
            if(next!=null){
                head.next = reverseKGroup(next,k);
            }
            return returnNode;
        }else{
            return head;
        }
    }


}

package com.xx;

import java.util.LinkedList;

/**
 * 21. 合并两个有序链表
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1==null&&l2==null){
                return null;
            }
        ListNode base1 = l1;
        ListNode base2 = l2;
        LinkedList<Integer> list = new LinkedList<>();
        while (base1!=null&&base2!=null){
            int a = base1.val;
            int b = base2.val;
            if(a<=b){
                list.push(a);
                base1 = base1.next;
            }else{
                list.push(b);
                base2 = base2.next;
            }
        }
        while (base1!=null){
            list.push(base1.val);
            base1 = base1.next;
        }
        while (base2!=null){
            list.push(base2.val);
            base2 = base2.next;
        }

        ListNode returnNode = new ListNode(list.pop());
        while (list.size()>0){
            ListNode temp = new ListNode(list.pop());
            temp.next = returnNode;
            returnNode = temp;
        }
        return returnNode;
    }

}

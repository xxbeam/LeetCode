package com.xx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 23. 合并K个排序链表
 */
public class MergeKSortedLists {

    public static ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <lists.length ; i++) {
            ListNode node = lists[i];
            while (node!=null){
                list.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(list);
        ListNode returnNode = null;
        for (int i = list.size()-1; i>=0; i--) {
            if(returnNode==null){
                returnNode = new ListNode(list.get(i));
            }else{
                ListNode temp = new ListNode(list.get(i));
                temp.next = returnNode;
                returnNode = temp;
            }
        }
        return returnNode;
    }

}

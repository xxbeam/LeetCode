package com.xx;

/**
 * 61. 旋转链表
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        //Node为空，或者k=0，不旋转
        if(head==null||k==0){
            return head;
        }
        int size = 0;
        ListNode temp = head;
        //获取最后一个节点
        ListNode last = null;
        while (temp!=null){
            size++;
            last = temp;
            temp = temp.next;
        }
        k = k % size;
        //如果K是0，则不旋转
        if(k==0){
            return head;
        }
        size = size - k;
        temp = head;
        //找到旋转点旋转
        while (temp!=null&&size>0){
            size--;
            if(size==0){
                ListNode end = temp;
                temp = temp.next;
                end.next = null;
                last.next = head;
            }else{
                temp = temp.next;
            }
        }
        return temp;
    }
}

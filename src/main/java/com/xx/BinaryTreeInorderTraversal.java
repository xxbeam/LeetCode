package com.xx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 */
public class BinaryTreeInorderTraversal {

    /**
     * 迭代
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> tempList = new LinkedList<>();
        TreeNode temp = root;
        while (temp!=null){
            if(temp.left!=null){
                //如果左节点有值，将根节点保存
                TreeNode node = temp;
                temp = temp.left;
                node.left = null;
                tempList.push(node);
                continue;
            }
            //左节点没有值，则取根节点值
            list.add(temp.val);
            if(temp.right!=null){
                //右节点有值，则遍历又节点
                temp = temp.right;
            }else{
                //去list中取上一个保存的节点
                if(tempList.size()>0){
                    temp = tempList.pop();
                }else{
                    //如果list为空，则遍历完了
                    temp = null;
                }
            }
        }
        return list;
    }


/**
 * 递归实现
 */
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//
//        if(root!=null){
//            get(root,list);
//
//        }
//        return list;
//    }
//
//    public void get(TreeNode node,List<Integer> list){
//        TreeNode left = node.left;
//        TreeNode right = node.right;
//
//        if(left!=null){
//            this.get(left,list);
//        }
//        list.add(node.val);
//        if(right!=null){
//            this.get(right,list);
//        }
//    }

}

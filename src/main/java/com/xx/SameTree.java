package com.xx;

/**
 * 100. 相同的树
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p!=null&&q!=null&&p.val == q.val){
            //递归处理
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }else{
            //p为空或者q为空或者两个的值不相等
            return false;
        }
    }
}

package com.xx;

/**
 * 96. 不同的二叉搜索树
 */
public class UniqueBinarySearchTrees {

    public int numTrees(int n) {

        //n个数的总个数是 G(n)=f(1)+f(2)+f(3)+f(4)+...+f(n) ，f(n)是以n为节点的二叉树个数
        //f(i) = g(n-i)*g(i-1),以i为节点的二叉树个数是其左右节点的总二叉树之积，左右数字个数各为i-1和n-i个
        //G(n) = g(0)*g(n-1)+...+g(n-1)*g(0)

        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i+1; j++) {
                arr[i] += arr[j-1]*arr[i-j];
            }
        }
        return arr[n];
    }


}

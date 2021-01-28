// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int pos;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pos = postorder.length-1;
        return help(0,inorder.length-1,inorder,postorder);
    }
    public TreeNode help(int left,int right, int[] in, int[] post){
        if(pos<0||left>right)return null;
        TreeNode res = new TreeNode(post[pos]);
        for(int i=left;i<=right;i++){
            if(in[i] == post[pos]){
                pos--;
                res.right = help(i+1,right,in,post);
                res.left = help(left,i-1,in,post);
                return res;
            }
        }
        return res;
    }
}

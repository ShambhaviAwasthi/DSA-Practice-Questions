// https://leetcode.com/problems/recover-binary-search-tree/
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
    TreeNode first, middle, last,prev;
    public void correctBST(TreeNode root){
        if(root!=null){
            correctBST(root.left);
                if(prev != null && root.val<prev.val){
                    if(first==null){
                    first=prev;
                    middle=root;
                    }
                    else
                        last=root;
                }
            prev=root;
            correctBST(root.right);
        }
            
    }
    public void recoverTree(TreeNode root) {
        first=middle=last=prev=null;
       correctBST(root);
        if(first!=null && last!=null){
            int temp=first.val;
            first.val=last.val;
            last.val=temp;
        }
        else if(first!=null && middle!=null){
            int temp=first.val;
            first.val=middle.val;
            middle.val=temp;
        }
    }
}

// https://leetcode.com/problems/binary-tree-right-side-view/

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        if(root==null)
            return res;
        
        Queue<TreeNode> q=new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> level=new ArrayList<Integer>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                level.add(temp.val);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                
            }
            res.add(level.get(level.size()-1));            
        }
        return res;
            
    }
}

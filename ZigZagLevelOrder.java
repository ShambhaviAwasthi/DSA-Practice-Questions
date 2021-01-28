// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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

        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res; 
        Queue<TreeNode> q = new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        boolean flag=true;
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i <size; i++)
            {        
                TreeNode node = q.poll();
                if(node.left!=null)
                    q.offer(node.left);
                if(node.right!=null)
                    q.offer(node.right);
                if(flag)
                    level.add(node.val);
                else
                    st.push(node.val);
            }
            while(!st.isEmpty()){
                level.add(st.pop());
            }
            res.add(level);
            flag=!flag;
            
        }
        
        return res;
    }
}
        
    

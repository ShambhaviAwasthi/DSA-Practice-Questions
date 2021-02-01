/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // using stack for DFS tree traversal
        Stack<TreeNode> st=new Stack<>();
        
        // hash map to store parents of the node
        Map<TreeNode,TreeNode> map=new HashMap<>();
        
        map.put(root,null); // parent of root is null
        st.push(root); // for traversal
        while(!map.containsKey(p)|| !map.containsKey(q)){
            TreeNode curr=st.pop();
            if(curr.left!=null){
                map.put(curr.left,curr);
                st.push(curr.left);
            }
            if(curr.right!=null){
                map.put(curr.right,curr);
                st.push(curr.right);
            }
        }
        Set<TreeNode> set=new HashSet<>();
        while(p!=null){
            set.add(p);
            p=map.get(p);
        }
        while(!set.contains(q))
            q=map.get(q);
        return q;
    }
}

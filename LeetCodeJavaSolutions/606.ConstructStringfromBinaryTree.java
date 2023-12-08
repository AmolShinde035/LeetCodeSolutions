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
    public String tree2str(TreeNode root) {
        StringBuilder s=new StringBuilder();
        dfs(root, s);
        return s.toString();    
    }
    public static void dfs(TreeNode t, StringBuilder s){
        if(t==null)
            return;
        s.append(String.valueOf(t.val));
        if(t.left==null && t.right==null)
            return;

        //add all left node
        s.append('(');
        dfs(t.left,s);
        s.append(')');
        //if right available then go for it

        if(t.right!=null){
             s.append('(');
             dfs(t.right,s);
            s.append(')');
        }

    }
}

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
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }public TreeNode invert(TreeNode node){
        if(node==null){
            return null;
        }
        if(node.left==null && node.right==null){
            return node;
        }
        TreeNode cp_node=new TreeNode(node.val);
        TreeNode left=invert(node.left);
        TreeNode right=invert(node.right);
        cp_node.left=right;
        cp_node.right=left;
        return cp_node;
    }
}

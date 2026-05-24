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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findLCA(root,p,q);
    }public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
             return null;
        }
        if(root.val==p.val || root.val==q.val){
            return root;
        }
        TreeNode left=findLCA(root.left,p,q);
        TreeNode right=findLCA(root.right,p,q);
        if(left==null){
            return right;
        }else if (right==null){
            return left;
        }else{
            return root;
        }
    }
}

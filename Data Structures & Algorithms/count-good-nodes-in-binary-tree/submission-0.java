class Solution {
    public int goodNodes(TreeNode root) {
        return count(root.val,root);
    }public int count(int max,TreeNode root){
        if(root==null){
            return 0;
        }
        int c=0;
        if(root.val>=max){
            c=1;
        }
        c+=count(Math.max(max,root.val),root.left);
        c+=count(Math.max(max,root.val),root.right);
        return c;
    }
}

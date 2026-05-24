
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        postOrder(list,root);
        return list;
    }public void postOrder(List<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        postOrder(list,root.left);
        postOrder(list,root.right);
        list.add(root.val);
    }
}
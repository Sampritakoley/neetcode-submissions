
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root==null){
            return res;
        }
        q.add(root);
        while(q.size()>0){
            int levelsize=q.size();
            List<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<levelsize;i++){
               TreeNode curr=q.poll();
               list.add(curr.val);
               if(curr.left!=null){
                   q.offer(curr.left);
               }
               if(curr.right!=null){
                   q.offer(curr.right);
               }
            }
            res.add(list);
        }
        return res;
    }
}

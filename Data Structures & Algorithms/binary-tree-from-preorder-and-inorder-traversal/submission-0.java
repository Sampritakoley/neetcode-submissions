

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        buildParent(inorder,map);
        return constructTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
    }public TreeNode constructTree(int[] preorder, int pst, int ped, int[] inorder, int inst,int ined,Map<Integer,Integer> map){
        if(pst > ped || inst>ined){
            return null; 
        }
        int rootIdx=map.get(preorder[pst]);
        int noOfLeft=rootIdx-inst;
        TreeNode root=new TreeNode(preorder[pst]);
        root.left=constructTree(preorder,pst+1,pst+noOfLeft,inorder,inst,rootIdx-1,map);
        root.right=constructTree(preorder,pst+noOfLeft+1,ped,inorder,rootIdx+1,ined,map);
        return root;
    }
    public void buildParent(int[] inorder, Map<Integer,Integer> map){
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
    }
}

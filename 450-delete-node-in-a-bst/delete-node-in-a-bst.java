class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);

        }
        else {
           if(root.left==null && root.right==null) return null;//0 child
           if(root.left==null) return root.right; //1 child
           if(root.right==null) return root.left;
           TreeNode succ=root.right;
           while(succ.left!=null) succ=succ.left;
           root.right=deleteNode(root.right,succ.val);
           succ.right=root.right;
           succ.left=root.left;
           return succ;

           }
        

        
    return root;
        
    }
}

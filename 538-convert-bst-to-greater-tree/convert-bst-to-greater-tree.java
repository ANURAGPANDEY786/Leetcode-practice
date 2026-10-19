class Solution {
    int sum=0;
    void revInorder(TreeNode root){
        if(root==null) return;
        revInorder(root.right);
        sum+=root.val;
        root.val=sum;
        revInorder(root.left);

    }
    public TreeNode convertBST(TreeNode root) {
        revInorder(root);
        return root;

        
    }
}
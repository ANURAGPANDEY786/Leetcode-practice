class Solution {
    TreeNode inorder(int[] nums,int l, int h){
    if(l>h) return null;
    int mid=(l+h)/2;
    TreeNode root=new TreeNode(nums[mid]);
    root.left=inorder(nums,l,mid-1);
    root.right=inorder(nums,mid+1,h);
    return root;
}
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        int l=0,h=n-1;
        
        return inorder(nums,l,h);
        

        
    }
}
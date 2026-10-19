class Solution {
    static int k2;
    static int ans;
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        k2--;
        if(k2==0) ans=root.val;
        inorder(root.right);

    }
    public int kthSmallest(TreeNode root, int k) {
        k2=k;
        ans=-1;
        
        inorder(root);
        return ans ;
        
    }
}
// class Solution {
//     void inorder(TreeNode root, ArrayList<Integer> arr){
//         if(root==null) return;
//         inorder(root.left,arr);
//         arr.add(root.val);
//         inorder(root.right,arr);

//     }
//     public int kthSmallest(TreeNode root, int k) {
//         ArrayList<Integer> arr=new ArrayList<>();
//         inorder(root,arr);
//         return arr.get(k-1);
        
//     }
// }
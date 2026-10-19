
// class Solution {
//     void inorder(TreeNode root,ArrayList<Integer> arr){
//         if(root==null) return;
//         inorder(root.left,arr);
//         arr.add(root.val);
//         inorder(root.right,arr);

//     }
//     public boolean isValidBST(TreeNode root) {
//         ArrayList<Integer> arr=new ArrayList<>();
//         inorder(root,arr);
//         for (int i = 0; i < arr.size() - 1; i++) {
//             if (arr.get(i) >= arr.get(i + 1)) {
//                 return false;
//             }
//         }

//         return true;
        
//     }
// }


    class Solution {
    TreeNode prev = null;

    boolean inorder(TreeNode root) {
        if (root == null) return true;

        if (!inorder(root.left)) return false;

        if (prev != null && prev.val >= root.val)
            return false;

        prev = root;

        return inorder(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }
}
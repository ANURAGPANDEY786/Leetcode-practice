// class Solution {
//     public void flatten(TreeNode root) {
//         if (root == null) return;

//         // Flatten left and right subtrees
//         flatten(root.left);
//         flatten(root.right);

//         // Store the right subtree
//         TreeNode temp = root.right;

//         // Move left subtree to right
//         root.right = root.left;
//         root.left = null;

//         // Attach original right subtree at the end
//         TreeNode curr = root;
//         while (curr.right != null) {
//             curr = curr.right;
//         }
//         curr.right = temp;
//     }
// }

// class Solution {
//    void flatten(TreeNode root){
//     if(root==null) return;
//     TreeNode left=root.left;
//     TreeNode right=root.right;
//     root.left=null;
//     root.right=null;
//     flatten(left);
//     flatten(right);
//     root.right=left;
//     TreeNode temp=root;
//     while(temp.right!=null){
//         temp=temp.right;
//     }
//     temp.right=right;
    

//    }
// }

// class Solution {
//     void dfs(TreeNode root,ArrayList<TreeNode> ans ){
//         if(root==null) return;
//         ans.add(root);
//         dfs(root.left,ans);
//         dfs(root.right,ans);
//     }
//     public void flatten(TreeNode root) {
//         ArrayList<TreeNode> ans=new ArrayList<>();
//         dfs(root,ans);
        
//         for(int i=0;i<ans.size()-1;i++){
//            TreeNode a= ans.get(i);
//            TreeNode b= ans.get(i+1);
//             a.left=null;
//             a.right=b;
//         }
//          if(ans.size()!=0){

//         TreeNode last=ans.get(ans.size()-1);
//         last.left=null;
//         last.right=null;
//          }

        
//     }
// }
class Solution {
   void flatten(TreeNode root){
         TreeNode cur=root;
        while(cur!=null){
            if(cur.left!=null){
                TreeNode pre=cur.left;
                while(pre.right!=null) pre=pre.right;
                    pre.right=cur.right;
                    cur.right=cur.left;
                    cur.left=null;
                    cur=cur.right;
                }
               
            else cur=cur.right;
        
  }
}
}
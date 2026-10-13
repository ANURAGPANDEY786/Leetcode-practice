// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> ans=new ArrayList<>();
//         if(root==null){
//             return ans;
//         }
//         ans.addAll(inorderTraversal(root.left));
//         ans.add(root.val);
//         ans.addAll(inorderTraversal(root.right));
//         return ans;

        
//     }
// }
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode cur = root;

        while (cur != null || !st.isEmpty()) {
            // Go left as far as possible
            while (cur != null) {
                st.push(cur);
                cur = cur.left;
            }
            // Process node
            cur = st.pop();
            ans.add(cur.val);
            // Move right
            cur = cur.right;
        }

        return ans;
    }
}

// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> ans=new ArrayList<>();
//        Stack<TreeNode> st=new Stack<>();
//        TreeNode cur=root;
//        while(st.size()>0 || cur!=null){
//        if(cur!=null){

//         if(cur.left!=null){
//         st.push(cur);
//         cur=cur.left;
// }
// else{
//     ans.add(cur.val);
//     cur=cur.right;
// }}

// else{
//     TreeNode temp=st.pop();
//     ans.add(temp.val);
//     cur=temp.right;
// }

//        }
//         return ans;

        
//     }
// }
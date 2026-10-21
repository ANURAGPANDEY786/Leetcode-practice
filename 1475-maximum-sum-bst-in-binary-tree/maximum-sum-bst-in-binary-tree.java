 class Quad{
    int min;  
    int max;
    int sum;
    boolean isBST;
    public Quad(int min,int max,int sum,boolean isBST){
        this.min=min;
        this.max=max;
        this.sum=sum;
        this.isBST=isBST;
    }
}
class Solution {
    static int maxSum;

    public int maxSumBST(TreeNode root) {
        maxSum=0;
         maxMin(root);
         return maxSum;
    }
    Quad maxMin(TreeNode root){
        if(root==null) return new Quad(Integer.MAX_VALUE,Integer.MIN_VALUE,0,true);
        Quad lst=maxMin(root.left);
        Quad rst=maxMin(root.right);
        int min=Math.min(root.val,Math.min(lst.min,rst.min));
        int max=Math.max(root.val,Math.max(lst.max,rst.max));
        
       boolean isBST= lst.isBST && rst.isBST && root.val>lst.max && root.val<rst.min ;
       int sum=lst.sum+rst.sum+root.val;
        
       if(isBST) {
        maxSum=Math.max(maxSum,sum);
       }
        return new Quad(min,max,sum,isBST);
    }
}

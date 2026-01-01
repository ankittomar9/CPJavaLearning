package basicDSAImplemetations.Tree;

public class Q_4_Are_given_Trees_Identical {
    public static void main(String args[]){
         // Build the Tree: 50(root), 30(L), 70(R), 20(LL), 40(LR)
         TreeNode A=new TreeNode(50);
         A.left=new TreeNode(30);
         A.right=new TreeNode(70);
         A.left.left=new TreeNode(20);
         A.left.right=new TreeNode(40);

            // Build the Tree Similar : 50(root), 30(L), 70(R), 20(LL), 40(LR)
         TreeNode B=new TreeNode(50);
         B.left=new TreeNode(30);
         B.right=new TreeNode(70);
         B.left.left=new TreeNode(20);
         B.left.right=new TreeNode(40);

         boolean isCheck=isTreeIdentical(A,B);
         if(isCheck==true){
            System.out.println("Trees are Identical");
         }else{
            System.out.println("Tress are Not identical");
         }
    }
    public static class TreeNode{

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }



    }


    public static boolean isTreeIdentical(TreeNode A,TreeNode B){
        if(A ==null && B==null)
            return true;

        if(A ==null || B==null)
            return false;

        if(A.val!=B.val){
            return false;
        }

        boolean leftSame=isTreeIdentical(A.left,B.left);
          boolean rightSame=isTreeIdentical(A.right,B.right);

        return leftSame && rightSame;
    }


}

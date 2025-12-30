package BasicDSAImplemetations.Tree;

public class Q_1_Height_of_Tree {
    public static void main(String args[]){
      //  Build the Tree: 50(root), 30(L), 70(R), 20(LL), 40(LR)
      TreeNode root=new TreeNode(50);
      root.left=new TreeNode(30);
      root.right=new TreeNode(70);
      root.left.left=new TreeNode(20);
      root.left.right=new TreeNode(40);
        
      int result=height(root);
      System.out.println("Height of Tree is \n"+result);
    

    }

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    
    }

    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return Math.max(leftHeight, rightHeight)+1; //+1 is the root level
    }
}

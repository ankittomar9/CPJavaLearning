package BasicDSAImplemetations.Tree;

public class Q_2_Sum_of_All_Nodes {
    public static void main(String args[]){
       // Build the Tree: 50(root), 30(L), 70(R), 20(LL), 40(LR)
       TreeNode root=new TreeNode(50);
       root.left=new TreeNode(30);
        root.right=new TreeNode(70);
        root.left.left=new TreeNode(20);
        root.left.right=new TreeNode(40);
        
        int result=Sum_Of_All_TreeNodes(root);
        System.out.println("Sum of all Nodes is \n"+result);
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
    
    public static int Sum_Of_All_TreeNodes(TreeNode root){
        if(root == null){
            return 0;
        }
        int sumLeft=Sum_Of_All_TreeNodes(root.left);
         int sumRight=Sum_Of_All_TreeNodes(root.right);

        return root.data+sumLeft+sumRight;
    }
}

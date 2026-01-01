package basicDSAImplemetations.Tree;

public class Q_3_Total_Nodes_in_Tree {
    public static void main(String args[]){
           // Build the Tree: 50(root), 30(L), 70(R), 20(LL), 40(LR)
            TreeNode root=new TreeNode(50);
            root.left=new TreeNode(30);
            root.right=new TreeNode(70);
            root.left.left=new TreeNode(20);
            root.left.right=new TreeNode(40);    

            int result=NodesCounter(root);
            System.out.println("Total Nodes are : \n "+result);

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
    
    public static int NodesCounter(TreeNode root){
        if(root == null){
            return 0;
        }
        //LeftSubtree Nodes
        int leftCount=NodesCounter(root.left);
        int rightCount=NodesCounter(root.right);

        return leftCount+rightCount+1;
        //why this is incorrect   return leftCount+rightCount+root;

    }
}

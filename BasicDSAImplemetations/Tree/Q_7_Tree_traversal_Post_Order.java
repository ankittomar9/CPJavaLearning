package BasicDSAImplemetations.Tree;

public class Q_7_Tree_traversal_Post_Order {
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        postOrder(root);
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
        
    public static void postOrder(TreeNode root){
        if(root==null){
            return;
        }
            //output  4 5 2 6 3 1 

        postOrder(root.left);
        postOrder(root.right);
         System.out.print(root.data +" ");
    }

}

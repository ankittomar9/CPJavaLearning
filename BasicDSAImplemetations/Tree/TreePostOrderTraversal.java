package basicDSAImplemetations.Tree;
public class TreePostOrderTraversal {
    public static void main(String args[]){
         // Build the Tree: 50(root), 30(L), 70(R), 20(LL), 40(LR)
         TreeNode root=new TreeNode(50);
         root.left=new TreeNode(30);
         root.right=new TreeNode(70);
         root.left.left=new TreeNode(20);
         root.left.right=new TreeNode(40);

         TreePostOrderTraversal tree=new TreePostOrderTraversal();
          System.out.println("--- PostOrder Traversal ---");
        System.out.print("Expected Sorted Output: ");
         tree.postOrder(root);

         System.out.println("\n");
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

        public void postOrder(TreeNode root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
             System.out.print(root.data+" ");

        }


    
}

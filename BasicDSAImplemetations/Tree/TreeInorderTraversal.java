package basicDSAImplemetations.Tree;
public class TreeInorderTraversal {
    public static void main(String args[]){
        // Build the Tree: 50(root), 30(L), 70(R), 20(LL), 40(LR)
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20); 
        root.left.right = new TreeNode(40); 

        // Create an instance of the class to call the non-static 'inorder' method
        TreeInorderTraversal tree = new TreeInorderTraversal();
        
        System.out.println("--- Inorder Traversal ---");
        System.out.print("Expected Sorted Output: ");
        
        // Execute the traversal starting from the root
        tree.inorder(root); 
        
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
        public void inorder(TreeNode node){
            if(node== null){
                return ;
            }
            inorder(node.left);
            System.out.print(node.data+" ");
              inorder(node.right);

        }

    }



/**
     * The Inorder Traversal method (Recursive implementation)
     * Order: Left -> Root -> Right
     */
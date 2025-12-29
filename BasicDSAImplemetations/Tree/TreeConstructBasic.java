package BasicDSAImplemetations.Tree;
public class TreeConstructBasic {
    public static void main(String args[]){
        System.out.println("Step 1: Creating the Root Node (50)");
        TreeNode root=new TreeNode(50);

        System.out.println("Step 2: Connecting Level 1 Children (30 and 70)");
        root.left=new TreeNode(30);
        root.right=new TreeNode(70);

    
        // 3. Expanding the tree (Adding children to the left child, 30)
        System.out.println("Step 3: Expanding the Left Branch (20 and 40)");
        // Access the left child of the root, and set its left child
        root.left.left = new TreeNode(20); 
        // Access the left child of the root, and set its right child
        root.left.right = new TreeNode(40); 

        // 4. Outputting the data to confirm the structure
        System.out.println("\nTree Structure Confirmed:");
        System.out.println("Root: " + root.data); // 50
        System.out.println("Root's Left Child: " + root.left.data); // 30
        System.out.println("Root's Left Child's Left Child: " + root.left.left.data); // 20



    }
     public  static class TreeNode{   // Defining the TreeNode 
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){  // Initializing the Tree Node  
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
  
}

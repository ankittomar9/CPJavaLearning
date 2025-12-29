package BasicDSAImplemetations.Tree;
import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrderTraversal {
    public static void main(String args[]){
          // Build the Tree: 50(root), 30(L), 70(R), 20(LL), 40(LR)
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(30);
        root.right=new TreeNode(70);
        root.left.left=new TreeNode(20);
        root.left.right=new TreeNode(40);

        // root.right.left=new TreeNode(10);
        // root.right.right=new TreeNode(25);
        // root.right.right.left=new TreeNode(5);
        // root.right.right.right=new TreeNode(8);
            

        TreeLevelOrderTraversal tree=new TreeLevelOrderTraversal();
        System.out.println(" --- Level-Order Traversal ---");
         System.out.println(" Expected Sorted Output: ");
        tree.LeveOrder(root);

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

    public void LeveOrder(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            // a. Dequeue the front node and process it
            // 'poll()' removes the head of the queue
            TreeNode current=queue.poll();
                System.out.print(current.data+" ");

          // b. Enqueue the left child (if it exists)      
           if(current.left!=null){
            queue.add(current.left);
           }     
           // c. Enqueue the right child (if it exists)
           if(current.right!=null){
            queue.add(current.right);
           }     
        }


    }


    
}

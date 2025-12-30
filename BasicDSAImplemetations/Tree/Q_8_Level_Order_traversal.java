package BasicDSAImplemetations.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Q_8_Level_Order_traversal {
    public static void main(String args[]){
    TreeNode root=new TreeNode(1);
    root.left=new TreeNode(2);
    root.right=new TreeNode(3);
    root.left.left=new TreeNode(4);
    root.left.right=new TreeNode(5);
    root.right.left=new TreeNode(6);

    levelOrderTraversal(root);
    
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
    
   public static void levelOrderTraversal(TreeNode root){
    if(root==null){
        return;
    }

         Queue<TreeNode>queue =new LinkedList<>();
         queue.add(root);

         while(!queue.isEmpty()){
            TreeNode current=queue.poll();

            System.out.print(current.data+" ");

            if(current.left!=null){
                queue.add(current.left);

            }
            if(current.right!=null){
                queue.add(current.right);

            }


         }



   } 

}

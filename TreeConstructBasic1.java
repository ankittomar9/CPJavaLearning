public class TreeConstructBasic1 {
    
    public static void main(String args[]){

        System.out.println("Tree Construct ");
        TreeNode root=new TreeNode(50);

          System.out.println(root.data);

          root.left=new TreeNode(60);
            root.right=new TreeNode(40);

        System.out.println(root.left.data);
         System.out.println(root.right.data);

    }


    public  static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){
            this.data=data;

            this.left=null;
            this.right=null;
        }
        
    }
}

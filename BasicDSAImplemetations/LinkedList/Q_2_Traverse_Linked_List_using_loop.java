package basicDSAImplemetations.LinkedList;

public class Q_2_Traverse_Linked_List_using_loop {
    
    public static void main(String args[]){
            Node node=new Node(10);
            node.next=new Node(20);
            node.next.next=new Node(30);
            node.next.next.next=new Node(40);
        
        Node temp=node;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public static  class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}

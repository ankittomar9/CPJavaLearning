package BasicDSAImplemetations.LinkedList;

public class Q_3_Linked_List_traverse_Revision {
    public static void main(String args[]){
        Node node=new Node(10);
        node.next=new Node(20);
        node.next.next=new Node(30);
        node.next.next.next=new Node(40);

        Node head=node; // Save the head head lost question lost list lost
        Node temp=head; // Node temp=node;
        

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    
}

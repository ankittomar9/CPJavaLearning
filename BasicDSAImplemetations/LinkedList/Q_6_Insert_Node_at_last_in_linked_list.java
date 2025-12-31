package BasicDSAImplemetations.LinkedList;

public class Q_6_Insert_Node_at_last_in_linked_list {
    public static void main(String args[]){
        Node node=new Node(10);
        node.next=new Node(20);
        node.next.next=new Node(30);
        node.next.next.next=new Node(40);

        Node head=node;
        Node temp=head;

        Node newNode=new Node(5);


        while(temp!=null){
            System.out.println(temp.next+" ");

        }
        temp=temp.next;



    }

    public static class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
}

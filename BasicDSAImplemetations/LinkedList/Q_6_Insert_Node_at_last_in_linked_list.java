package basicDSAImplemetations.LinkedList;

public class Q_6_Insert_Node_at_last_in_linked_list {
    public static void main(String args[]){
        Node node=new Node(10);
        node.next=new Node(20);
        node.next.next=new Node(30);
        node.next.next.next=new Node(40);

        Node head=node;
        Node temp=head;

       Node newNode=new Node(50);

        while(temp.next!=null){ // this will go from 10 to 40 and after 40 we have null
            System.out.print(temp.data+" ");
              temp=temp.next;
        }
       temp.next=newNode;

        while(temp.next!=null){ // this will go from 10 to 40 and after 40 we have null
            System.out.print(temp.data+" -> ");
              temp=temp.next;
        }
         System.out.print(" null ");
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

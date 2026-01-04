package BasicDSAImplemetations.LinkedList;
public class Q_9_linked_list_insert_at_position {
    public static void main(String args[]){
        //suppose you want to insert the between 20 and 30
        Node head=new Node(10);         head.next=new Node(20);
        head.next.next=new Node(30);         head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

        int position=2;         Node curr=head;        Node prev=null;
        //    while(curr!=null){  // traverse and print the Original list 
        //       System.out.print(curr.data+" -> ");
        //       curr=curr.next;        // } 
           Node insertNode=new Node(25); // declare new Node
        for(int i=0;i<position-1;i++){
                curr=curr.next;
        }
       // Right Side Connection: 25 -> 30
            insertNode.next = curr.next; 

        // Left Side Connection: 20 -> 25
          curr.next = insertNode;
          curr=head;
             while(curr!=null){  // traverse and print the list 
              System.out.print(curr.data+" -> ");
              curr=curr.next;
        } 
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

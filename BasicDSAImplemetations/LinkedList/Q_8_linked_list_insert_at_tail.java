package BasicDSAImplemetations.LinkedList;
public class Q_8_linked_list_insert_at_tail {
    public static void main(String args[]){
        //Q_8_linked_list_insert_at_tail
        Node head=new Node(10);        head.next=new Node(20);
        head.next.next=new Node(30);        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

        Node curr=head;
        Node insertNode=new Node(60);
        //   if(head==null){
        //     head=insertNode;
        //     System.out.print(head.data+" ");   } edge case on platforms in our case dead code

        while(curr.next!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        curr.next=insertNode;
          while(curr!=null){
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

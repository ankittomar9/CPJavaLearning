package BasicDSAImplemetations.LinkedList;
public class Q_7_linked_list_insertion_at_head {
    public static void main(String args[]){

        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

        Node curr=head;
        Node InsertNode =new Node(5);  // think where InsertNode.next will be
        
        InsertNode.next=head;
        head=InsertNode;

        curr=head;// update curr for traversal
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


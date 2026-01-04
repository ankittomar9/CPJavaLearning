package BasicDSAImplemetations.LinkedList;

public class Q_5_Insert_Node_in_a_LL {
    public static void main(String args[]){
        Node node=new Node(10);   //Node head=new Node(10);
         node.next=new Node(20);
         node.next.next=new Node(30);
         node.next.next.next=new Node(40);

        Node head=node;  // this is at 10
        Node temp=head;  // temp is at 10
        //Insert a node to the starting positing
        // Let 5 be the new Node
        // Node node =new Node(5); this replace the Node with data 10
        // head =new Node(5);  this will change the head but he connection to next nodes is broken
        // we have head and we have head in temp 
        Node newNode=new Node(5);

            newNode.next=head;     // 5->10 but where it head its at node 10 head has 10
            head=newNode;   // head is at 5
            temp=head;      // temp changed from 10 to 5
        
            while(temp!=null){
            System.out.print(temp.data + " -> ");
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

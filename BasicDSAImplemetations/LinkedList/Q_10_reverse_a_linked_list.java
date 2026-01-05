package BasicDSAImplemetations.LinkedList;

public class Q_10_reverse_a_linked_list {
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
          Node curr = head;
          Node temp=head;
        // Original List
        System.out.println("Original:");
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next; 
        }
        System.out.println("null");
        // Initalize empty nodes
        Node prev = null;
        Node forwardNode = null;
        
        while(curr != null){
              forwardNode = curr.next;  //save the future
              //             // 2. REWIRE backwards
            curr.next = prev;  // connect backwards
            // 3. MOVE the team forward
            prev = curr;       // prev steps on the node we just finished
            curr = forwardNode; // curr steps on the next node to process
        }
        // At the end, 'curr' is null, so 'prev' is the NEW HEAD
        head = prev; 
        // --- PRINT REVERSED LIST ---
        System.out.println("\nReversed:");
        curr = head; // Reset curr to new head
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
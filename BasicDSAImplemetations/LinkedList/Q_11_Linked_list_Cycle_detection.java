package BasicDSAImplemetations.LinkedList;

public class Q_11_Linked_list_Cycle_detection {
    public static void main(String args[]){
        /*LeetCode 141 (Easy/Medium)
        We need to check if a Linked List has a loop (a cycle).
        Normal List: 1 -> 2 -> 3 -> null (Ends)
        Cyclic List: 1 -> 2 -> 3 -> 2... (Infinite loop)  */
         Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
       head.next.next.next.next=head.next;// connecting 20 again after 50  

        Node slow=head; Node fast=head;
        boolean cycleFound=false;
       while(fast != null && fast.next != null){
            slow = slow.next;         // Move 1
            fast = fast.next.next;    // Move 2
            // --- STEP 3: COLLISION CHECK ---
            if(slow == fast){
                cycleFound = true;
                break; // Stop the loop, we found it!
            }
        }
        if(cycleFound) {
            System.out.println("Cycle Detected! The loop exists.");
        } else {
            System.out.println("No Cycle. Linear List.");
        }
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

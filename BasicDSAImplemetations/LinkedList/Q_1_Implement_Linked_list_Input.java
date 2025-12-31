package BasicDSAImplemetations.LinkedList;

public class Q_1_Implement_Linked_list_Input {
   

    // 1. The Standard Node Class (static so we can use it easily)
    public static class Node {
        int data;
        Node next;
        public Node(int data) { this.data = data; this.next = null; }
    }

    public static void main(String[] args) {
        // INPUT: An easy-to-read array
        int[] values = {10, 20, 30, 40, 50};

        // MAGIC: Convert array to List automatically
        Node head = arrayToLinkedList(values);

        // VERIFY: Print it to see if it worked
        printList(head);
    }

    // ⭐ THE HELPER FUNCTION (Save this!)
    public static Node arrayToLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        // 1. Create Head
        Node head = new Node(arr[0]);
        
        // 2. Mover Pointer
        Node current = head;

        // 3. Loop through the rest (start from i=1)
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]); // Create and Link
            current = current.next;          // Move Pointer
        }

        return head; // Return the anchor
    }

    // Utility to print (so we don't rewrite the while loop every time)
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
    


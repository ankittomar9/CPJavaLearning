package basicDSAImplemetations.LinkedList;

public class Q_4_Search_element_in_the_list {
    public static void main(String args[]){
        Node node=new Node(10);
        node.next=new Node(20);
        node.next.next=new Node(30);
        node.next.next.next=new Node(40);

        Node head=node;
        Node  temp=head;
        int target =30;
        boolean isFound =false;

  //        System.out.println(temp.data); debug value here is 10 which correct
           
        while(temp != null){   // stopping condition
            if(temp.data==target){   //value search
                  System.out.println(temp.data);  //just printing
                isFound=true;                    // flag reset
                
                break;                           // come out of loop                                
            }
               temp=temp.next;                  // move to next node
            
        }
      
        if(isFound==true){
            System.out.println("Target exists in linked List");
        }else{
             System.out.println("Target does not exists in linked List");
        }

    }

    public static class Node{
        int data;
        Node next;

       public  Node(int data){
            this.data=data;
            this.next=null;
         }
    }
    
}

package BasicDSAImplemetations.Stacks;
public class Q_1_MyStackExample {
    public static void main(String args[]){
        MyStack stack=new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

         System.out.println("Elements are Pushed \n ");

        System.out.println("Top element is : "+stack.peek());
         System.out.println("Top element is Popped: "+stack.pop());
        System.out.println("Top element After Pop : "+stack.peek());
         System.out.println("Is Stack empty: "+stack.isEmpty());

          System.out.println("Top element is Popped: "+stack.pop());
        System.out.println("Top element After Pop : "+stack.peek());
         System.out.println("Is Stack empty: "+stack.isEmpty());

          System.out.println("Top element is Popped: "+stack.pop());
        System.out.println("Top element After Pop : "+stack.peek());
         System.out.println("Is Stack empty: "+stack.isEmpty());
            
           
    }
    public static class MyStack{
         int arr[];
        int top;
        int capacity;

        //Stack functions
           public MyStack(int size){
            this.capacity=size;
            this.arr=new int[size];
            this.top=-1;
           } 

        // 1.Push
        public void push(int x){
          if(top==capacity-1){
            System.out.println("Stack Overflow ! Cannot add "+ x);
            return;
          }
          top++;
          arr[top]=x;
          System.out.println(x+ " pushed in to stack");
        }

        //2.Pop
        public int pop(){
            if(top==-1){
                System.out.println("Stack Underflow ! Nothing to Pop ");
                return -1;
            }
            int poppedValue=arr[top];
            top--;
            return poppedValue;
        }

        //3.Peek
            public int peek(){
                if(top==-1){
                System.out.println("Stack is Empty ");
                return -1;
            }
            return arr[top];
            }

        //4.isEmpty
        public boolean isEmpty(){
            return top==-1;
        }


    }
   
    
}

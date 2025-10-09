public class Arrays_Min_Max_1_Loop {
        public static void main(String args[]){
            int arr[]={2,9,6,7,8,2,4,5,1,3,6};

            int min=Integer.MAX_VALUE;  
            int max=Integer.MIN_VALUE;

            for(int i=0;i<arr.length;i++){
                int current_element=arr[i];

                if(current_element>max){
                    max=arr[i];
                }
                 if(current_element<min){
                    min=arr[i];
                }
            }

            System.out.println("The maximum element in Array is : "+max);
            System.out.println("The minimum element in Array is : "+min);
        }

}

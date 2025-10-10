public class Arrays_Product_Of_element {
    public static void main(String args[]){
        int arr[]={7,9,2,51};
        double product=1;

        for(int i=0;i<arr.length;i++){
            product=arr[i]*product;
        }
        
        System.out.println("The product of all elements in array is : "+product);
    }
}

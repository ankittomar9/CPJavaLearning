package BasicDSAImplemetations.Strings.Basics;
public class Q_3_Toggle_case_lower_upper_both_COUNT {
    public static void main(String args[]){
          String s1="Aman_Learns_Streams_LAMBDAS";
                 System.out.println("Original Array String : \n"+s1);
          char arr[]=s1.toCharArray();
            int upper_count=0;
            int lower_count=0;

          for(int i=0;i<arr.length;i++){
                if(arr[i]>='a' && arr[i]<='z'){
                    arr[i]=(char)(arr[i]-32);
                    upper_count++;

                }
                else if(arr[i]>='A' && arr[i]<='Z'){
                    arr[i]=(char)(arr[i]+32);
                    lower_count++;
                }
          }
          String s2=new String(arr);
           System.out.println("\n New Array String : \n"+s2);
         //    System.out.println(Arrays.toString(arr));
              System.out.println("UpperCase letter count "+upper_count);
                   System.out.println("LowerCase letter count "+lower_count);
    }
    
}

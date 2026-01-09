package dsa_advance.array;

public class Q_17_Arrays_a_b_pairs_optimized {
    //Given a String/char array of lowercase a and b 
   //Find the count of pairs(i,j) such that i<j and arr[i]=a and arr[j]=b 
    public static void main(String args[]){
        String s1="dcabbaab";
        
       int count_of_a=0;
       int ans=0;
        char arr[]=s1.toCharArray();

       for(int i=0;i<arr.length;i++){
        if(arr[i]=='a'){
            count_of_a++;
        }
        if(arr[i]=='b'){
            ans=ans+count_of_a;
        }
       }
       System.out.println("Count of pairs (a,b) can be formed: \n"+ans);
    }
    
}

package BasicDSAImplemetations.Strings.Basics;
import java.util.Arrays;
public class Q_4_Count_sort_Strings {
    public static void main(String args[]){
        String s1="badabczfe";
          System.out.print("Original String : \n"+s1);
        int freq[]=new int[26];
            int index=0;
    
            for(int i=0;i<s1.length();i++){
            index=s1.charAt(i)-'a';
            freq[index]++;
        }

      System.out.println("Frequency Array \n"+Arrays.toString(freq));
        // a=2 times b= 2 times  c d e f z are 1 time and others are zero times
     
        System.out.print("\nSorted String : \n");
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i];j++){

                char c =(char)(i+'a');
                System.out.print(c);
            }            
        }
    }    
}

package BasicDSAImplemetations.Strings.Basics;

public class Q_12_Count_the_Occurences {
    public static void main(String args[]){
       /*Find the number of occurrences of bob
        in string A consisting of lowercase English alphabets. */
        String s1="abobob"; 
        if(s1==null ||s1.length()==0){ 
            System.out.println("Empty String or null ");return;        }
      
        int count=0;
        int k=3;
        for(int i=0;i<=s1.length()-k;i++){
            if(s1.charAt(i)=='b' && s1.charAt(i+1)=='o' && s1.charAt(i+2)=='b'){
                count++;
            }
        }   

        System.out.println("Number of bob in string are : \n"+count);
    }
    
}

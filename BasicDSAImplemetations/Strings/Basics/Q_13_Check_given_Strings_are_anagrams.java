package BasicDSAImplemetations.Strings.Basics;

public class Q_13_Check_given_Strings_are_anagrams {
    public static void main(String args[]){
        /*Two strings are Anagrams if they contain the exact same characters with the exact same frequencies,
         just in a different order (e.g., "silent" and "listen"). */
            String s1="listen";String s2="silent";  // int s2="silena"; for test negative case
            if(s1.length()!=s2.length()){
                System.out.println("String lengths different not anagrams");return;  }

         int freq[]=new int[26];
         int index=0;

         for(int i=0;i<s1.length();i++){
             index=s1.charAt(i) -'a';
             freq[index]++;   
         }


              for(int i=0;i<s2.length();i++){
             index=s2.charAt(i) -'a';
             freq[index]--;   
         }

        for(int i=0;i<26;i++){
            if(freq[i]!=0){
              System.out.println("Not Anagrams");
                return;  
            }
        }
       System.out.println("Strings are Anagrams"); 
    }
    
}

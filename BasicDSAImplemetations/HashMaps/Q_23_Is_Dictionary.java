package BasicDSAImplemetations.HashMaps;

import java.util.Arrays;
import java.util.HashMap;

public class Q_23_Is_Dictionary {
   public static void main(String args[]){
     String[] words1 = {"hello", "leetcode"};
        String order1 = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println("Alphabet Order: \n" + order1);
        System.out.println("Words: \n" + Arrays.toString(words1) 
                + " -> Is Sorted? " + isAlienSorted(words1, order1) + "\n");

     String[] words2 = {"word", "world", "row"};
        String order2 = "wordabcefghijklmnpqstuvxyz"; // 'd' comes before 'l'
        System.out.println("Alphabet Order: \n" + order2);
        System.out.println("Words: \n" + Arrays.toString(words2) 
        + " -> Is Sorted? " + isAlienSorted(words2, order2));     
   } 
   public static boolean isAlienSorted(String words[],String order){
    if(words ==null || words.length<=1){    return true;    }
    HashMap<Character,Integer> rankMap=new HashMap<>();
        for(int i=0;i<order.length();i++){
            rankMap.put(order.charAt(i),i);
        }
        for(int i=0;i< words.length-1; i++){
            String w1=words[i]; String w2=words[i+1];
            boolean foundDifference=false;

            int minLength=Math.min(w1.length(), w2.length());
            for(int j=0;j<minLength;j++){
                char c1=w1.charAt(j);char c2=w2.charAt(j);
         if(c1 !=c2){
             if(rankMap.get(c1)>rankMap.get(c2)) return false;
                }
                foundDifference=true; break;            
            }
            if (!foundDifference && w1.length() > w2.length()) {
                return false;
            }
        }    return true;   }   }

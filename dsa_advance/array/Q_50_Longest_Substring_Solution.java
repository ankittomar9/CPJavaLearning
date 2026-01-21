package dsa_advance.array;
import java.util.HashMap;

public class Q_50_Longest_Substring_Solution {
    public static void main(String args[]){
  String s = "pwwkew";     int n = s.length();     int maxLength = 0;     int left = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < n; right++){
            char currentChar = s.charAt(right);

            // 1. EAT: Add 1 to the frequency of currentChar
            // Syntax: map.put(key, map.getOrDefault(key, 0) + 1);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            
            // 2. CHECK: While we have a duplicate (count > 1)
            while(map.get(currentChar) > 1){
                // A. Find the character at the TAIL (left)
                char charAtLeft = s.charAt(left);
                
                // B. Remove it (Decrease its count by 1)
                map.put(charAtLeft, map.get(charAtLeft) - 1);
                
                // C. Move tail forward
                left++;
            }
            
            // 3. UPDATE: Window is clean now. Calculate length.
            // (Note: Move this OUTSIDE the while loop)
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        System.out.println("Longest Substring Length: " + maxLength);
    }
}

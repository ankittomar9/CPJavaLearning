package BasicDSAImplemetations.Strings.Basics;

public class Q_7_Longest_Palindromic_Substring_Simple {

    // Step 1: Create global variables to track the best palindrome found so far
    static int maxLen = 0;
    static int start = 0;

    public static void main(String args[]) {
        String s = "aaaabaaa";
        
        if (s == null || s.length() < 1) return;

        // Reset for fresh run
        maxLen = 0;
        start = 0;

        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd length (Center is i) -> e.g., "aba"
            checkPalindrome(s, i, i);
            
            // Case 2: Even length (Center is i, i+1) -> e.g., "abba"
            checkPalindrome(s, i, i + 1);
        }
        
        System.out.println("Longest Palindrome: " + s.substring(start, start + maxLen));
        
    }

    // Step 2: Helper method does ALL the work
    public static void checkPalindrome(String s, int left, int right) {
        // Expand outwards
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // NOTE: After the loop finishes, 'left' and 'right' are one step too far.
        // The valid palindrome is from (left + 1) to (right - 1).
        
        // Calculate length of the valid part
        // Formula: (right - 1) - (left + 1) + 1  SIMPLIFIES TO -> right - left - 1
        int currentLen = right - left - 1;

        // Step 3: Simply update if we found a bigger one
        if (currentLen > maxLen) {
            maxLen = currentLen;
            start = left + 1; // The valid start is one step back from where 'left' ended
        }
    }
}
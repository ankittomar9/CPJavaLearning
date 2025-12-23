package BasicDSAImplemetations.Stacks;
import java.util.Stack;

public class Q_29_ValidParenthesis {
    public static void main(String args[]){
        String s = "(]"; // Change this to test different cases
        Stack<Character> st = new Stack<>();
        int n = s.length();
        boolean isValid = true; // Flag to track validity

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);

            // 1. Push Openers
            if(c == '(' || c == '{' ||  c == '['){
                st.push(c);
            }
            // 2. Handle Closers
            else {
                // Fix 1: Stop immediately if stack is empty
                if(st.isEmpty()){
                    System.out.println("Invalid: Extra closing bracket found.");
                    isValid = false;
                    break; 
                }

                char top = st.peek();

                // Fix 2: SPECIFIC matching only!
                // We check: Is the specific pair correct?
                if(c == ')' && top == '(') {
                    st.pop();
                } 
                else if(c == '}' && top == '{') {
                    st.pop();
                } 
                else if(c == ']' && top == '[') {
                    st.pop();
                } 
                else {
                    // Fix 3: If mismatch, stop immediately
                    System.out.println("Invalid: Mismatched pair " + top + " and " + c);
                    isValid = false;
                    break;
                }
            }
        }

        // Final Check
        if (isValid && st.isEmpty()) {
            System.out.println("String is Valid");
        } else {
            System.out.println("String is Invalid");
        }
    }
}
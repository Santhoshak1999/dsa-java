import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char par : s.toCharArray()) {
            if (par == '(') {
                stack.push(')');
            } else if (par == '{') {
                stack.push('}');
            } else if (par == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != par) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

public class ParenthesesValidator {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String test1 = "()((()))";
        String test2 = "({[()]})";
        String test3 = "()(a)()";//I this 
       // String test4 = "({[}])";
        
        System.out.println("Test 1 is valid: " + solution.isValid(test1));
        System.out.println("Test 2 is valid: " + solution.isValid(test2));
        System.out.println("Test 3 is valid: " + solution.isValid(test3));
       // System.out.println("Test 4 is valid: " + solution.isValid(test4));
    }
}

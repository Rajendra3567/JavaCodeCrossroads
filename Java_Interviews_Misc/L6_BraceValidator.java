import java.util.Stack;

public class L6_BraceValidator {
    public static void main(String[] args) {
        String[] testInputs = {
                "()[]{}",       // true
                "({[]})",       // true
                "([)]",         // false
                "(((",          // false
                "{[()]}",       // true
                "{[(])}",       // false
                "",             // true (empty is valid)
                "[]{",          // false
                "([{}])(){}",   // true
                ")(",           // false
        };
        for(String input : testInputs) {
            System.out.println("Input : "+ input+" -->  " + isValidBraces(input));
        }
    }

    private static Boolean isValidBraces(String input) {
        Stack<Character> stack = new Stack<>();
        for(char ch: input.toCharArray()) {
            // Push opening brackets to the stack
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // on encoutering a closing brackets
            else if(ch == ')' || ch == ']' || ch == '}') {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if(
                        ch == ')' && top != '(' ||
                        ch == ']' && top != '[' ||
                        ch == '}' && top != '{'
                ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

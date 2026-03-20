package org.example.SlidingWindow;

import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        //  Stack<Character> stack = new Stack<Character>();
        System.out.println(isBalanced("{[()]}"));  // true
        System.out.println(isBalanced("{[(])}"));  // false
        System.out.println(isBalanced("((()))"));  // true
        System.out.println(isBalanced("(()"));     // false


    }

   /* public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray()){
            if(c == '('){
                stack.push();
            }
        }
    }*/


    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : str.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {

                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}
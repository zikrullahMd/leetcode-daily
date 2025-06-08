/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean isValid(String s) {

        // if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for(Character c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                if(c == ')' && stack.peek() != '(' || c == ']' && stack.peek() != '[' || c == '}' && stack.peek() != '{'){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        for(Character c : stack){
            System.out.println(c);
        }

        return stack.isEmpty();
    }
}
// @lc code=end


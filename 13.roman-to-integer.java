/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

 /*
  HINT : check for next character
         Use HashMap to store character values.
         if next is greater then its a mixed
         if not then just get the current one
         
  */

// @lc code=start
import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);

        int i = 0;
        while(i < s.length() && i< s.length() ){
            int current = map.get(s.charAt(i));
            int next = 0;
            if(i < s.length() -1 ){
                next = map.get(s.charAt(i+1));
            }

            if(next > current){
                ans += (next - current);
                i+=2;
            }else{
                ans += current;
                i++;
            }
        }

        return ans;
    }
}
// @lc code=end

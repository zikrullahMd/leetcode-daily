/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcp = "";

        if(strs.length == 0) return "";

        for(int i = 0; i<strs[0].length();i++){
            char curr = strs[0].charAt(i);

            for(int j = 1;j<strs.length;j++){
                if(i > strs[j].length() - 1 || curr != strs[j].charAt(i)){
                    return lcp;
                }
            }
            lcp += curr;
        }

        return lcp;
    }
}
// @lc code=end


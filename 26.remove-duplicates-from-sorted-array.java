/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = 0;
        int it = 0;
        HashSet<Integer> set = new HashSet();

        for(it = 0;it<nums.length;it++){
            if(!set.contains(nums[it])){
                set.add(nums[it]);
                nums[curr] = nums[it];
                curr++;
            }
        }
        System.out.println(curr);

        return curr;
    }
}
// @lc code=end


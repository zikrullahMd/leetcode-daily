/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode f = l1;
        ListNode s = l2;
        ListNode curr = list;
        int carry = 0;

        while(f != null || s != null || carry > 0){
            int sum = 0;
            if(f != null){
                sum += f.val;
                f = f.next;
            }
            if(s != null){
                sum += s.val;
                s = s.next;
            }
            sum += carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        


        return list.next;
    }
}
// @lc code=end


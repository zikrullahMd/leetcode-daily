/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 * 
 * // Note : It ran and all test cases passed but throwing issue in VS Code.
 */

// @lc code=start

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 
  }

  class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode(0);

        ListNode f = list1;
        ListNode s = list2;
        ListNode curr = list;

        while(f != null && s != null){
            if(f.val < s.val){
                System.out.println("Entered 1");
                curr.next = new ListNode(f.val);
                f = f.next;
            }else if(s.val <= f.val){
                System.out.println("Entered 2");
                curr.next = new ListNode(s.val);
                s = s.next;
            }
            curr = curr.next;
        }

        while(f != null){
            curr.next = new ListNode(f.val);
            f = f.next;
            curr = curr.next;
        }
        while(s != null){
            curr.next = new ListNode(s.val);
            s = s.next;
            curr = curr.next;
        }


        return list.next;
    }
}
// @lc code=end


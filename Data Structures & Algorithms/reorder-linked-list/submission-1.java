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
    public void reorderList(ListNode head) {
        //find mid node
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = slow.next;
        slow.next = null;

        //reverse list from mid to last

        ListNode prev = null;
        ListNode next = null;
        while(cur != null){
            next = cur.next;
            cur.next= prev;
            prev = cur;
            cur = next;
        }

        //collect and arrange
        ListNode list1 = head;
        ListNode list2 = prev;
        while(list2 != null){
            //store next node reference
            ListNode tmp1 = list1.next;
            ListNode tmp2 = list2.next;

            //arrange 
            list1.next = list2;
            list2.next = tmp1;

            //shift to next node
            list1 = tmp1;
            list2 = tmp2;

        }
     
    }
}

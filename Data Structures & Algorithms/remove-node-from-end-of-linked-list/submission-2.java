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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len = 0;
        ListNode cur = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        
        int index = len - n;
        if(index == 0){
            return head.next;
        }

        ListNode prev = new ListNode();
        cur = head;
        while(index > -1 && cur != null){
            if(index == 0){
                prev.next = cur.next;
                cur.next = null;
                break;
            }
            prev = cur;
            cur = cur.next;
            index--;
        }
        
       
        return head;
    }
}

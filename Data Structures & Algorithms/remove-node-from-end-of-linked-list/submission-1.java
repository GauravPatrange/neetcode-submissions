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
        ListNode rev=reverse(head);

        ListNode cur = rev;
        ListNode prev = null;

        if(n == 1){
            rev=cur.next;
            return reverse(rev);
        }

        for(int i = 1; cur != null && i < n ;i++){
            prev=cur;
            cur=cur.next;

        }
        if(cur != null){
            prev.next=cur.next;
        }
        return reverse(rev);
        
    }
    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode next;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev=cur;
            cur= next;
            
            
        }
        return prev;
    }
    
}

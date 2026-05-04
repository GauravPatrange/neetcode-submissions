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
    public boolean hasCycle(ListNode head) {
         Set<Integer> next = new HashSet<>();
        System.out.println(head.next);
        while(head != null){
            if(next.contains(head.val)){
                return true;
            }
            next.add(head.val);
            head = head.next;
        }
        if(head == null){
            return false;
        }
        return true;
    }
}

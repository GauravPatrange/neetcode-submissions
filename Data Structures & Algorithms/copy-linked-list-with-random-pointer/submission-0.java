/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        map.put(null, null);

        Node curPointer = head;
        while(curPointer != null){
            Node copy = new Node(curPointer.val);
            map.put(curPointer, copy);

            curPointer = curPointer.next;
        }
        curPointer = head;
        while(curPointer != null){
            Node copy = map.get(curPointer);
            copy.next = map.get(curPointer.next);
            copy.random= map.get(curPointer.random);

            curPointer = curPointer.next;
        }
        return map.get(head);
        
        
    }
}

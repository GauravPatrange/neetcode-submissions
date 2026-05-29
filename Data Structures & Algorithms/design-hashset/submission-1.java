class MyHashSet {
    private static class Node{
        int key;
        Node next;

        Node(int key){
            this.key = key;
        }
    }

    private final Node[] set;
    public MyHashSet() {
        set = new Node[1000];
        for(int i=0;i<set.length;i++){
            set[i]=new Node(0);
        }
    }
    
    public void add(int key) {
        Node cur = set[key % set.length];
        while(cur.next != null){
            if(cur.next.key == key){
                return;
            }
            cur = cur.next;
        }
        cur.next = new Node(key);
        
    }
    
    public void remove(int key) {
        Node cur = set[key % set.length];
        while(cur.next != null){
            if(cur.next.key == key){
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
       
        
    }
    
    public boolean contains(int key) {
        boolean flag = false;
        Node cur = set[key % set.length];
        while(cur.next != null){
            if(cur.next.key == key){
                flag =true;
            }
            cur = cur.next;
        }
        return flag;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
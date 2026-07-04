class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int val : nums){
            heap.add(val);
            if(heap.size() > k){
                heap.remove();
            }
        }
        return heap.peek();
        
    }
}

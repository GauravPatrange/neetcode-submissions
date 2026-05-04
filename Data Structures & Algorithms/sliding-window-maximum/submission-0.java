class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         int[] ans = new int[nums.length-k+1];
        Deque<Integer> queue = new ArrayDeque<>();
        int iPtr = 0;
        int jPtr = 0;

        int i = -1;
        while(jPtr < nums.length){
            while(queue.size() > 0 && queue.getLast() < nums[jPtr]){
                queue.removeLast();
            }
            queue.addLast(nums[jPtr]);

            if(jPtr-iPtr+1 < k){
                jPtr++;
            }else if(jPtr-iPtr+1 == k){
                ans[++i] = queue.getFirst();
                if(queue.getFirst() == nums[iPtr]){
                    queue.removeFirst();
                }
                iPtr++;
                jPtr++;
            }
        }
        return ans;

    }
}

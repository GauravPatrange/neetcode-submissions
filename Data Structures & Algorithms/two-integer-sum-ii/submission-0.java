class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int low = 0;
        int high = numbers.length-1;

        int[] arr = new int[2];
        while(low<high){
           int curSum = numbers[low] + numbers[high];
           
            if(curSum > target){
                high-=1;
            }else if(curSum < target){
                low+=1;
            }else{
                arr[0]=low+1;
                arr[1]=high+1;
                break;
            }

        }
        return arr;
    
    }
}

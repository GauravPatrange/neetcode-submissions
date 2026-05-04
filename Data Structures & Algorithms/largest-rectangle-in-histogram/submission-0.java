class Solution {
    public int largestRectangleArea(int[] heights) {
        
		int[] NSL = getNSL(heights);
		int[] NSR = getNSR(heights);
		
		int[] width = new int[heights.length];
		for(int i=0;i<heights.length;i++) {
			width[i]=NSR[i]-NSL[i]-1;
			width[i]=width[i]*heights[i];
		}
		int max = Integer.MIN_VALUE;
		for(int val:width) {
			if(val>max) {
				max=val;
			}
		}

		return max;
        
    }
    public static int[] getNSR(int[] arr) {
		Stack<List<Integer>> stack = new Stack();
		int[] result = new int[arr.length];
		int rightGround = arr.length;
		
		for(int i=arr.length-1;i>=0;i--) {
			if(stack.empty()) {
				result[i]=rightGround;
			}else if(!stack.empty() && arr[i]>stack.peek().get(0)) {
				result[i] = stack.peek().get(1);
			}else if(!stack.empty() && arr[i]<=stack.peek().get(0)) {
				while(!stack.empty() && arr[i]<=stack.peek().get(0)) {
					stack.pop();
				}
				if(stack.empty()) {
					result[i]=rightGround;
				}else {
					result[i]=stack.peek().get(1);
				}
			}
			stack.push(Arrays.asList(arr[i],i));
		}

		return result;
	}
	
	public static  int[] getNSL(int[] arr) {
		
		Stack<List<Integer>> stack = new Stack();
		int[] result = new int[arr.length];
		int leftGround = -1;
		for(int i=0;i<arr.length;i++) {
			if(stack.empty()) {
				result[i]=leftGround;
			}else if( !stack.empty() && arr[i] > stack.peek().get(0)) {
				result[i]=stack.peek().get(1);
			}else if( !stack.empty() && arr[i] <= stack.peek().get(0)){
				while(!stack.empty() && arr[i]<=stack.peek().get(0)) {
					stack.pop();
				}
				if(stack.empty()) {
					result[i]=leftGround;
				}else {
					result[i]=stack.peek().get(1);
				}
			}
				
				
			stack.push(Arrays.asList(arr[i],i));
		}
		
		
		return result;
		
	}
}

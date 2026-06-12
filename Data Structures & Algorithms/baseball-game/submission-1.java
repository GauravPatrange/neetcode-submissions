class Solution {
    public int calPoints(String[] operations) {

        Deque<String> stack = new ArrayDeque<String>();

        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int val1 = Integer.parseInt(stack.removeFirst());
                int val2 = Integer.parseInt(stack.peek());
                stack.push(val1+"");
                stack.push(val1+val2+"");
            }else if(operations[i].equals("C")){
                stack.removeFirst();
            }else if(operations[i].equals("D")){
                int val1 = Integer.parseInt(stack.peek());
                stack.push(val1*2+"");
            }else{
                stack.push(operations[i]);
            }
        }

        int total =0;
        for(String val:stack){
            total+=Integer.parseInt(val);
        }
        return total;
    }
}
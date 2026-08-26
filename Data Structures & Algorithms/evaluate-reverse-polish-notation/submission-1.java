class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int val1 = stack.pop();
                int val2 = stack.pop();

                if(tokens[i].equals("+")){
                    stack.push(val1+val2);
                }else if(tokens[i].equals("-")){
                    stack.push(val2-val1);
                }else if(tokens[i].equals("*")){
                    stack.push(val1*val2);
                }else{
                    stack.push(val2/val1);
                }
                continue;
            }
            stack.push(Integer.parseInt(tokens[i]));

        }
        return stack.peek();
    }
}

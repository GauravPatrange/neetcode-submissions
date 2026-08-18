class StockSpanner {

static class Pair{
        int price;
        int index;
        
        public Pair(int price, int index){
            this.price=price;
            this.index=index;
        }
        public int getPrice(){
            return this.price;
        }
        public int getIndex(){
            return this.index;
        }
    }

    Deque<Pair> stack;
    private int index = 0;

    public StockSpanner() {
        stack = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int res;
        
        while(!stack.isEmpty() && stack.peek().getPrice() <= price){
            stack.pop();
        }

        if(stack.isEmpty()){
            res= index+1;
        }else{
            res=  index - stack.peek().getIndex();
        }
        stack.push(new Pair(price, index++));
        return res;
       
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
class MinStack {
    
    Stack<Integer> st;     
    Stack<Integer> minSt;
    public MinStack() {
        st = new Stack<>();      
        minSt = new Stack<>(); 
        
    }
    
    public void push(int val) {
        st.push(val);
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    }
    
    public void pop() {
         int removed = st.pop();
        if (removed == minSt.peek()) {
            minSt.pop();
        }
    }
    
    public int top() {
          return st.peek();
    }
    
    public int getMin() {
          return minSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
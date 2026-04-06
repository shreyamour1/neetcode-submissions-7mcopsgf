class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt; //containsminValue at each stage-
    int min=Integer.MAX_VALUE;

    public MinStack() {
        st= new Stack<>();
        minSt= new Stack();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
           st.push(val);
           minSt.push(val);
        }
        else{
            if(val<minSt.peek()){
                minSt.push(val);
            }
            else{
                minSt.push(minSt.peek());
            }
              st.push(val);
        }    
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minSt.peek();
    }
}

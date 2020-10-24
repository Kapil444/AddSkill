class MyStack {
  Queue<Integer> q = new LinkedList<>(); 
    Queue<Integer> temp = new LinkedList<>();
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(temp.size()==0){
             q.add(x);
        }else{
            temp.add(x);
        }
       
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(temp.size()==0){
        while(q.size()!=1){
            temp.add(q.peek());
            q.remove();
        }
            int x = q.peek();
            q.remove();
            return x;
        }else{
            while(temp.size()!=1){
                q.add(temp.peek());
                temp.remove();
            }
             int x = temp.peek();
            temp.remove();
            return x;
        }
    }
    
    /** Get the top element. */
    public int top() {
        if(temp.size()==0){
        while(q.size()!=1){
            temp.add(q.peek());
            q.remove();
        }
            int x = q.peek();
            temp.add(x);
            q.remove();
            return x;
        }else{
            while(temp.size()!=1){
                q.add(temp.peek());
                temp.remove();
            }
             int x = temp.peek();
            q.add(x);
            temp.remove();
            return x;
        }
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(temp.size()==0&&q.size()==0){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

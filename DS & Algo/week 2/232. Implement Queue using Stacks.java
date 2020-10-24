class MyQueue {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
        while(!s.empty()){
            temp.push(s.peek());
            s.pop();
        }
        
        int x = temp.peek();
        temp.pop();
        
        while(!temp.empty()){
            s.push(temp.peek());
            temp.pop();
        }
        return x;
    }
    
    /** Get the front element. */
    public int peek() {
        while(!s.empty()){
            temp.push(s.peek());
            s.pop();
        }
        
        int x = temp.peek();
        
        while(!temp.empty()){
            s.push(temp.peek());
            temp.pop();
        }
        return x;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

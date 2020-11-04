class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack stack = new Stack();
        int result[]=new int[T.length];
        for(int i =0;i<T.length;i++){
            if(!stack.empty()){
                if(T[i]>T[(int)stack.peek()]){
                    while(!stack.empty()&&T[i]>T[(int)stack.peek()]){
                       int ind =  (int)stack.pop();
                         result[ind] = i-ind;
                    }                    
                }
                stack.push(i);
            }else{
                stack.push(i);
            }
        }
        return result;
    }
}
